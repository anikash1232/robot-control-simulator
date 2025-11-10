package com.comp301.a07robot;

import java.awt.*;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class PowerUpDecorator extends RobotDecorator {
  final PowerType powerType;

  public PowerUpDecorator(Robot decoratedRobot, PowerType powerType) {
    super(decoratedRobot);
    this.powerType = powerType;
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", " + powerType + " Power Up";
  }

  @Override
  public int getHealth() {
    return super.getHealth() * powerType.getMultiplier();
  }

  @Override
  public int getPower() {
    return super.getPower() * (powerType.getMultiplier() * 10);
  }

  @Override
  public Parent getVisual() {
    StackPane pane = (StackPane) decoratedRobot.getVisual();
    String fileName = "";

    if (powerType == PowerType.APPRENTICE){
      fileName = "yellow_power.png";
    }
    else if(powerType == PowerType.ENCHANTER){
      fileName = "red_power.png";
    }
    else if(powerType == PowerType.SORCERER){
      fileName = "blue_power.png";
    }

    ImageView power = new ImageView(new Image(fileName));
    power.setFitWidth(600);
    power.setFitHeight(700);
    pane.getChildren().addFirst(power);
    return pane;
  }
}
