# Steampunk Factory — Forge 1.20.1 Reference

## Build
- Minecraft: 1.20.1
- Forge: 47.2.0
- Java toolchain: 17 (auto-provisioned via foojay resolver)
- Output JAR: `build/libs/steampunk_factory-1.0.0.jar`

## Commands
```bat
gradlew.bat build
gradlew.bat runClient
gradlew.bat runServer
```

## Asset layout
All mod assets live under `src/main/resources/assets/steampunk_factory/`:
- `blockstates/<block>.json` → `steampunk_factory:block/<block>`
- `models/block/<block>.json` → texture `steampunk_factory:block/<block>`
- `textures/block/<block>.png`

The separate `steampunk_factory_rp` folder was a broken resource pack; assets were merged into the mod with the correct namespace.

## 14 placeholder textures
Blocks without original art reuse a related texture (see `scripts/merge-assets.ps1` fallbacks).