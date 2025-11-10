package com.comp301.a07robot;

import java.awt.*;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class BasicRobot implements Robot {

  private int health;
  private int shield;
  private int power;

  public BasicRobot() {
    this.health = 50;
    this.shield = 0;
    this.power = 10;
  }

  @Override
  public String getDescription() {
    return "Basic Robot";
  }

  @Override
  public int getHealth() {
    return health;
  }

  @Override
  public int getShield() {
    return shield;
  }

  @Override
  public int getPower() {
    return power;
  }

  public Parent getHealthBar() {

    ImageView heart = new ImageView(new Image("health.png"));
    ImageView halfHeart = new ImageView(new Image("health_half.png"));

    int hearts = getHealth() / 10;
    int halfHearts = getHealth() % 10;
    HBox healthBar = new HBox();

    for (int i = 0; i < hearts; i++) {
      heart.setFitWidth(30);
      heart.setFitHeight(30);
      healthBar.getChildren().add(heart);
    }

    if (halfHearts > 0) {
      halfHeart.setFitWidth(30);
      halfHeart.setFitHeight(30);
      healthBar.getChildren().add(halfHeart);
    }

    return healthBar;
  }

  public Parent getShieldBar() {
    ImageView shieldpic = new ImageView(new Image("shield.png"));
    ImageView halfshieldpic = new ImageView(new Image("shield_half.png"));

    int shield = getShield() / 10;
    int halfShield = getShield() % 10;
    HBox shieldBar = new HBox();

    for (int i = 0; i < shield; i++) {
      shieldpic.setFitWidth(30);
      shieldpic.setFitHeight(30);
      shieldBar.getChildren().add(shieldpic);
    }

    if (halfShield > 0) {
      halfshieldpic.setFitWidth(30);
      halfshieldpic.setFitHeight(30);
      shieldBar.getChildren().add(halfshieldpic);
    }
    return shieldBar;
  }

  @Override
  public Parent getVisual() {
    return null;
  }
}
