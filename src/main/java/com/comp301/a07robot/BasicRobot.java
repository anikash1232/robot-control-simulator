package com.comp301.a07robot;

import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

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
    HBox healthBar = new HBox();

    int hearts = health / 10;
    int halfHearts = health % 10;


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

  public Parent getShieldBar() {

    HBox shieldBar = new HBox();



    int totalshield = shield / 10;
    int halfShield = shield % 10;


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
    ImageView iv = new ImageView(new Image("base.png"));
    StackPane pane = new StackPane(iv);
    return pane;
  }
}
