# Tech Reborn New Upgrades

Tech Reborn New Upgrades is a Fabric addon for Tech Reborn that expands machine customization with new upgrade tiers focused on speed, energy handling, and stack-based processing.

## Included upgrades

- Overclocker MK2
  - Increases processing speed while increasing power usage.
- Overclocker MK3
  - Further boosts speed and power draw for high-end machines.
- Transformer MK2
  - Raises machine energy tier by 2.
- Transformer Infinite
  - Pushes machine energy tier beyond normal bounds to effectively infinite-tier operation.
- Stack Upgrade
  - Lets machines process multiple items per operation.
  - Configurable default behavior: 16 items per operation.
- Omni Upgrade
  - Combines stack processing, Overclocker MK3 behavior, and Transformer Infinite power-tier scaling in one upgrade.
  - Configurable default behavior: 64 items per operation.

## Current behavior

This mod is designed to let players choose between:

- faster crafting loops
- stronger power throughput
- larger batch processing
- combined late-game upgrade stacking for high-output machines

The batch-processing values are configurable and can be tuned depending on your pack balance goals.

## Installation

1. Install Fabric Loader.
2. Install Fabric API.
3. Install Tech Reborn and RebornCore.
4. Place the mod jar into your mods folder.
5. Launch the game and enjoy the new upgrades.

## Configuration

The main balancing values live in the config class and are designed to be adjusted for pack balance:

- Overclocker MK2 speed and power multipliers
- Overclocker MK3 speed and power multipliers
- Stack processing amount
- Omni processing amount

## Credits

- Code and design inspired by the Tech Reborn ecosystem.
- Some logic is adapted from Tech Reborn and RebornCore usage patterns.

## Minecraft compatibility (development branch)

The `1.21.1-dev` branch targets **Minecraft 1.21.1**, Fabric Loader, and Java 21.
Install Fabric API, Tech Reborn 5.11.18, and RebornCore 5.11.19.
This is a development port; verify the build and test machine behavior in-game
before using it in a long-running world.
