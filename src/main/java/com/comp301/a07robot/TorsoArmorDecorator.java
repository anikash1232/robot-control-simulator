package com.comp301.a07robot;

import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class TorsoArmorDecorator extends RobotDecorator {
  final ArmorType armorType;

  public TorsoArmorDecorator(Robot decoratedRobot, ArmorType armorType) {
    super(decoratedRobot);
    this.armorType = armorType;
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", " + armorType + " Torso Armor";
  }

  @Override
  public int getShield() {
    return super.getShield() + armorType.getShieldUpgrade();
  }

  @Override
  public Parent getVisual() {
    StackPane pane = (StackPane) decoratedRobot.getVisual();
    String fileName;

    if (armorType == ArmorType.BRONZE){
      fileName = "torso.png";
    }
    else if(armorType == ArmorType.IRON){
      fileName = "torso_iron.png";
    }
    else if(armorType == ArmorType.GOLD){
      fileName = "torso_gold.png";
    }
    else if(armorType == ArmorType.DIAMOND){
      fileName = "torso_diamond.png";
    }
    else{
      fileName = "torso.png";
    }

    ImageView torso = new ImageView(new Image(fileName));
    pane.getChildren().add(torso);
    return pane;
  }
}
