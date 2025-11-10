package com.comp301.a07robot;

import java.awt.*;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

public class JetpackDecorator extends RobotDecorator {

  public JetpackDecorator(Robot decoratedRobot) {
    super(decoratedRobot);
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", Jetpack";
  }

  @Override
  public int getShield() {
    return super.getShield() + 50;
  }

  @Override
  public Parent getVisual(){
    StackPane pane = (StackPane) decoratedRobot.getVisual();
    ImageView jet = new ImageView(new Image("jetpack.png"));
    pane.getChildren().add(jet);
    return pane;
  }
}
