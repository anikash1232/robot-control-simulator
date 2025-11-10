package com.comp301.a07robot;

import java.awt.*;
import javafx.scene.Parent;

public abstract class RobotDecorator implements Robot {

  private Robot decoratedRobot;

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
