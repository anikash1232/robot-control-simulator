package com.comp301.a07robot;

import java.awt.*;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

public class LegsArmorDecorator extends RobotDecorator {
  final ArmorType armorType;

  public LegsArmorDecorator(Robot decoratedRobot, ArmorType armorType) {
    super(decoratedRobot);
    this.armorType = armorType;
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", " + armorType + " Legs Armor";
  }

  @Override
  public int getShield() {
    return super.getShield() + armorType.getShieldUpgrade();
  }
}
