package com.comp301.a07robot;

import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class BoomDecorator extends RobotDecorator {

  public BoomDecorator(Robot decoratedRobot) {
    super(decoratedRobot);
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", Boom";
  }

  @Override
  public int getShield() {
    return super.getShield() + 40;
  }

  @Override
  public Parent getVisual() {
    StackPane pane = (StackPane) decoratedRobot.getVisual();
    ImageView jet = new ImageView(new Image("boom.png"));
    pane.getChildren().add(jet);
    return pane;
  }
}
