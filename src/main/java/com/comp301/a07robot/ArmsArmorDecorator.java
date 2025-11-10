package com.comp301.a07robot;

import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class ArmsArmorDecorator extends RobotDecorator {
  final ArmorType armorType;

  public ArmsArmorDecorator(Robot decoratedRobot, ArmorType armorType) {
    super(decoratedRobot);
    this.armorType = armorType;
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", " + armorType + " Arms Armor";
  }

  @Override
  public int getShield() {
    return super.getShield() + armorType.getShieldUpgrade();
  }

  @Override
  public Parent getVisual() {
    StackPane pane = (StackPane) decoratedRobot.getVisual();
    String fileName;

    if (armorType == ArmorType.BRONZE) {
      fileName = "arms.png";
    } else if (armorType == ArmorType.IRON) {
      fileName = "arms_iron.png";
    } else if (armorType == ArmorType.GOLD) {
      fileName = "arms_gold.png";
    } else if (armorType == ArmorType.DIAMOND) {
      fileName = "arms_diamond.png";
    } else {
      fileName = "arms.png";
    }

    ImageView arms = new ImageView(new Image(fileName));
    pane.getChildren().add(arms);
    return pane;
  }
}
