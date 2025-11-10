package com.comp301.a07robot;


import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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

  @Override
  public Parent getVisual() {
    StackPane pane = (StackPane) decoratedRobot.getVisual();
    String fileName;

    if (armorType == ArmorType.BRONZE) {
      fileName = "legs.png";
    } else if (armorType == ArmorType.IRON) {
      fileName = "legs_iron.png";
    } else if (armorType == ArmorType.GOLD) {
      fileName = "legs_gold.png";
    } else if (armorType == ArmorType.DIAMOND) {
      fileName = "legs_diamond.png";
    } else {
      fileName = "legs.png";
    }

    ImageView legs = new ImageView(new Image(fileName));
    pane.getChildren().add(legs);
    return pane;
  }
}
