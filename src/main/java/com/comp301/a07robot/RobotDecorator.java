package com.comp301.a07robot;

import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public abstract class RobotDecorator implements Robot {

  protected Robot decoratedRobot;

  public RobotDecorator(Robot decoratedRobot) {
    this.decoratedRobot = decoratedRobot;
  }

  @Override
  public String getDescription() {
    return decoratedRobot.getDescription();
  }

  @Override
  public int getHealth() {
    return decoratedRobot.getHealth();
  }

  @Override
  public int getShield() {
    return decoratedRobot.getShield();
  }

  @Override
  public int getPower() {
    return decoratedRobot.getPower();
  }

  @Override
  public Parent getHealthBar() {
    HBox healthBar = new HBox();

    int hearts = getHealth() / 10;
    int halfHearts = getHealth() % 10;

    for (int i = 0; i < hearts; i++) {
      ImageView heart = new ImageView(new Image("health.png"));
      heart.setFitWidth(30);
      heart.setFitHeight(30);
      healthBar.getChildren().add(heart);
    }

    if (halfHearts > 0) {
      ImageView halfHeart = new ImageView(new Image("health_half.png"));
      halfHeart.setFitWidth(30);
      halfHeart.setFitHeight(30);
      healthBar.getChildren().add(halfHeart);
    }

    return healthBar;
  }

  @Override
  public Parent getShieldBar() {
    HBox shieldBar = new HBox();

    int totalshield = getShield() / 10;
    int halfShield = getShield() % 10;

    for (int i = 0; i < totalshield; i++) {
      ImageView shieldpic = new ImageView(new Image("bar.png"));
      shieldpic.setFitWidth(30);
      shieldpic.setFitHeight(30);
      shieldBar.getChildren().add(shieldpic);
    }

    if (halfShield > 0) {
      ImageView halfshieldpic = new ImageView(new Image("bar_half.png"));
      halfshieldpic.setFitWidth(30);
      halfshieldpic.setFitHeight(30);
      shieldBar.getChildren().add(halfshieldpic);
    }
    return shieldBar;
  }

  @Override
  public Parent getVisual() {
    return decoratedRobot.getVisual();
  }
}
