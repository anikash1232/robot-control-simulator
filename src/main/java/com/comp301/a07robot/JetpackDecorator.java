package com.comp301.a07robot;

public class JetpackDecorator extends RobotDecorator{


    public JetpackDecorator(Robot decoratedRobot){
        super(decoratedRobot);
    }


    @Override
    public String getDescription(){
        return super.getDescription() + ", Jetpack";
    }

    @Override
    public int getShield(){
        return super.getShield() + 50;
    }

}
