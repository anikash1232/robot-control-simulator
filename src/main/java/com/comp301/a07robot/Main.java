package com.comp301.a07robot;

import static javafx.application.Application.launch;

public class Main {

  public static Robot build() {
    Robot ani = new BasicRobot();


    ani = new ArmsArmorDecorator(ani, ArmorType.DIAMOND);
    ani = new HeadArmorDecorator(ani, ArmorType.DIAMOND);
    ani = new LegsArmorDecorator(ani, ArmorType.BRONZE);
    ani = new TorsoArmorDecorator(ani, ArmorType.BRONZE);
    ani = new JetpackDecorator(ani);
    ani = new PowerUpDecorator(ani, PowerType.ENCHANTER);
    ani = new PowerUpDecorator(ani, PowerType.SORCERER);

    return ani;
  }

  public static void main(String[] args) {
    launch(RobotBuilder.class);
  }
}
