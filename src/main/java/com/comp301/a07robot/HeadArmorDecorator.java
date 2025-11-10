package com.comp301.a07robot;


import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class HeadArmorDecorator extends RobotDecorator {
  final ArmorType armorType;

  public HeadArmorDecorator(Robot decoratedRobot, ArmorType armorType) {
    super(decoratedRobot);
    this.armorType = armorType;
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", " + armorType + " Head Armor";
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
      fileName = "head.png";
    } else if (armorType == ArmorType.IRON) {
      fileName = "head_iron.png";
    } else if (armorType == ArmorType.GOLD) {
      fileName = "head_gold.png";
    } else if (armorType == ArmorType.DIAMOND) {
      fileName = "head_diamond.png";
    } else {
      fileName = "head.png";
    }

    ImageView head = new ImageView(new Image(fileName));
    pane.getChildren().add(head);
    return pane;
  }
}
