package com.comp301.a07robot;

public class JetpackArmorDecorator extends RobotDecorator{

    final ArmorType armorType;

    public JetpackArmorDecorator(Robot decoratedRobot, ArmorType armorType){
        super(decoratedRobot);
        this.armorType = armorType;
    }


    @Override
    public String getDescription(){
        return super.getDescription() + ", " + armorType + " Jetpack Armor";
    }

    @Override
    public int getShield(){
        return super.getShield() + 50;
    }
}
