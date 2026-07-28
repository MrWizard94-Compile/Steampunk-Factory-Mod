$ErrorActionPreference = 'Stop'
$utf8NoBom = New-Object System.Text.UTF8Encoding $false
function Write-JsonFile([string]$Path, [string]$Content) {
    [System.IO.File]::WriteAllText($Path, $Content, $utf8NoBom)
}
$modAssets = 'C:\WPAI\steampunk_factory_mod\src\main\resources\assets\steampunk_factory'
$rpAssets  = 'C:\WPAI\steampunk_factory_rp\assets\minecraft'
$modData   = 'C:\WPAI\steampunk_factory_mod\src\main\resources\data\steampunk_factory'

$dirs = @(
    "$modAssets\blockstates",
    "$modAssets\models\block",
    "$modAssets\models\item",
    "$modAssets\textures\block",
    "$modAssets\textures\item",
    "$modAssets\lang"
)
foreach ($d in $dirs) { New-Item -ItemType Directory -Path $d -Force | Out-Null }

# Copy block textures from resource pack into mod namespace
if (Test-Path "$rpAssets\textures\block") {
    Get-ChildItem "$rpAssets\textures\block" -Filter '*.png' | ForEach-Object {
        Copy-Item $_.FullName "$modAssets\textures\block\$($_.Name)" -Force
    }
}
if (Test-Path "$rpAssets\textures\item") {
    Get-ChildItem "$rpAssets\textures\item" -Filter '*.png' | ForEach-Object {
        Copy-Item $_.FullName "$modAssets\textures\item\$($_.Name)" -Force
    }
}

$fallbacks = @{
    'airship_lamp'           = 'brass_control_panel'
    'balloon_segment'        = 'balloon_fabric'
    'boiler_block'           = 'heavy_machinery_block'
    'brass_gearbox'          = 'heavy_gearbox_housing'
    'brass_plating'          = 'brass_control_panel'
    'brass_riveted_plating'  = 'riveted_factory_wall'
    'conveyor_belt'          = 'industrial_metal_floor'
    'gondola_door'           = 'gondola_wall'
    'gondola_floor'          = 'gondola_wall'
    'mechanical_press'       = 'piston_assembly'
    'rusty_boiler_block'     = 'rusty_heavy_gearbox_housing'
    'rusty_brass_plating'     = 'rusty_brass_control_panel'
    'rusty_steam_pipe'       = 'rusty_pipe_manifold'
    'steam_pipe'             = 'pipe_manifold'
}

$modBlocksFile = 'C:\WPAI\steampunk_factory_mod\src\main\java\com\steampunkfactory\ModBlocks.java'
$blocks = Select-String -Path $modBlocksFile -Pattern 'register\("([^"]+)"' | ForEach-Object {
    if ($_.Line -match 'register\("([^"]+)"') { $matches[1] }
}

foreach ($block in $blocks) {
    $tex = "$modAssets\textures\block\$block.png"
    if (-not (Test-Path $tex) -and $fallbacks.ContainsKey($block)) {
        $src = "$modAssets\textures\block\$($fallbacks[$block]).png"
        if (Test-Path $src) { Copy-Item $src $tex -Force }
    }

    $blockstate = @"
{
  "variants": {
    "": { "model": "steampunk_factory:block/$block" }
  }
}
"@
    Write-JsonFile "$modAssets\blockstates\$block.json" $blockstate

    $model = @"
{
  "parent": "minecraft:block/cube_all",
  "textures": {
    "all": "steampunk_factory:block/$block"
  }
}
"@
    Write-JsonFile "$modAssets\models\block\$block.json" $model

    $itemModel = @"
{
  "parent": "steampunk_factory:block/$block"
}
"@
    Write-JsonFile "$modAssets\models\item\$block.json" $itemModel
}

$itemOnly = @('brass_gear', 'mechanics_wrench', 'pressure_gauge', 'brass_steam_valve')
foreach ($item in $itemOnly) {
    $itemModel = @"
{
  "parent": "minecraft:item/generated",
  "textures": {
    "layer0": "steampunk_factory:item/$item"
  }
}
"@
    Write-JsonFile "$modAssets\models\item\$item.json" $itemModel
}

function Format-Name([string]$id) {
    return ($id -split '_' | ForEach-Object { $_.Substring(0,1).ToUpper() + $_.Substring(1) }) -join ' '
}

$lang = [ordered]@{
    'itemGroup.steampunk_factory' = 'Steampunk Factory'
}
foreach ($block in $blocks) {
    $lang["block.steampunk_factory.$block"] = Format-Name $block
    $lang["item.steampunk_factory.$block"] = Format-Name $block
}
foreach ($item in $itemOnly) {
    $lang["item.steampunk_factory.$item"] = Format-Name $item
}

$langJson = "{`n"
foreach ($kv in $lang.GetEnumerator()) {
    $langJson += "  `"$($kv.Key)`": `"$($kv.Value)`",`n"
}
$langJson = $langJson.TrimEnd(",`n") + "`n}"
Write-JsonFile "$modAssets\lang\en_us.json" $langJson

$lootTemplate = @'
{
  "type": "minecraft:block",
  "pools": [
    {
      "rolls": 1,
      "entries": [
        {
          "type": "minecraft:item",
          "name": "steampunk_factory:BLOCKNAME"
        }
      ],
      "conditions": [
        {
          "condition": "minecraft:survives_explosion"
        }
      ]
    }
  ]
}
'@

$lootDir = "$modData\loot_tables\blocks"
New-Item -ItemType Directory -Path $lootDir -Force | Out-Null
foreach ($block in $blocks) {
    $path = "$lootDir\$block.json"
    if (-not (Test-Path $path)) {
        ($lootTemplate -replace 'BLOCKNAME', $block) | Set-Content -Path $path -Encoding UTF8
    }
}

$recipeTemplate = @'
{
  "type": "minecraft:crafting_shaped",
  "pattern": [
    "III",
    "I I",
    "III"
  ],
  "key": {
    "I": { "item": "minecraft:iron_ingot" }
  },
  "result": {
    "item": "steampunk_factory:BLOCKNAME",
    "count": 1
  }
}
'@

$recipeDir = "$modData\recipes"
New-Item -ItemType Directory -Path $recipeDir -Force | Out-Null
foreach ($block in $blocks) {
    $path = "$recipeDir\$block.json"
    if (-not (Test-Path $path)) {
        ($recipeTemplate -replace 'BLOCKNAME', $block) | Set-Content -Path $path -Encoding UTF8
    }
}

Write-Host "Merged assets for $($blocks.Count) blocks."
Write-Host "Block textures: $((Get-ChildItem "$modAssets\textures\block" -Filter '*.png').Count)"
Write-Host "Blockstates: $((Get-ChildItem "$modAssets\blockstates" -Filter '*.json').Count)"
Write-Host "Block models: $((Get-ChildItem "$modAssets\models\block" -Filter '*.json').Count)"