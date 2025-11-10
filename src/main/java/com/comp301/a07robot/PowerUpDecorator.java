package com.comp301.a07robot;

import java.awt.*;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

public class PowerUpDecorator extends RobotDecorator{
    final PowerType powerType;

    public PowerUpDecorator(Robot decoratedRobot, PowerType powerType){
        super(decoratedRobot);
        this.powerType = powerType;
    }


    @Override
    public String getDescription(){
        return super.getDescription() + ", " + powerType + " Power Up";
    }

    @Override
    public int getHealth(){
        return super.getHealth() * powerType.getMultiplier();
    }

    @Override
    public int getPower(){
        return super.getPower() * (powerType.getMultiplier()*10);
    }
}
