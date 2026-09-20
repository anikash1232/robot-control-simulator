# Robot Control Simulator

A robot customisation system in Java built on the decorator pattern, with a JavaFX visual
that reflects every modification you stack onto the machine.

## What it does

You start with a basic robot and wrap it in layers — armour on each body part, jetpacks,
explosives, magical power-ups. Each layer changes the robot's stats and its rendered
appearance. Because every decorator both *is* a robot and *wraps* a robot, they compose in
any order and to any depth without the base class knowing they exist.

- Armour decorators for head, torso, arms and legs, in four tiers: bronze (10), iron (15),
  gold (20) and diamond (25)
- Power-up decorators with escalating multipliers — apprentice, enchanter, sorcerer
- Jetpack and explosive attachments that alter the robot's capabilities
- Live health, shield and power bars rendered in JavaFX
- A builder for assembling configurations fluently

## Architecture

```
Robot                   interface - description, health, shield, power, visual
BasicRobot              the undecorated base implementation
RobotDecorator          abstract base: holds an inner Robot, forwards by default

  HeadArmorDecorator      \
  TorsoArmorDecorator      |  armour tiers via ArmorType
  ArmsArmorDecorator       |
  LegsArmorDecorator      /
  PowerUpDecorator        stat multipliers via PowerType
  JetpackDecorator        mobility
  BoomDecorator           explosive payload

ArmorType, PowerType    enums carrying their own numeric values
RobotBuilder            fluent assembly of decorator stacks
```

The design pays off in the view layer. `Robot` exposes `getVisual()` returning a JavaFX
`Parent`, so each decorator renders its own layer on top of whatever it wraps. Adding a new
attachment means writing one decorator class — no changes to `BasicRobot`, no conditional
branching anywhere, and the visual composes for free.

## Running it

Requires Java 17+ and Maven.

```bash
mvn clean javafx:run
```
