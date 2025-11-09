package com.comp301.a07robot;

import javafx.scene.Parent;

public class BasicRobot implements Robot {

  private int health;
  private int shield;
  private int power;

  public BasicRobot(){
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

  @Override
  public Parent getHealthBar() {
    return null;
  }

  @Override
  public Parent getShieldBar() {
    return null;
  }

  @Override
  public Parent getVisual() {
    return null;
  }
}
