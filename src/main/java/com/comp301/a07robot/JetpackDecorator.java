package com.comp301.a07robot;

public class JetpackDecorator extends RobotDecorator{

    final ArmorType armorType;

    public JetpackDecorator(Robot decoratedRobot, ArmorType armorType){
        super(decoratedRobot);
        this.armorType = armorType;
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
