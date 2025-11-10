package com.comp301.a07robot;

public class TorsoArmorDecorator extends RobotDecorator{
    final ArmorType armorType;

    public TorsoArmorDecorator(Robot decoratedRobot, ArmorType armorType){
        super(decoratedRobot);
        this.armorType = armorType;
    }


    @Override
    public String getDescription(){
        return super.getDescription() + ", " + armorType + " Torso Armor";
    }

    @Override
    public int getShield(){
        return super.getShield() + armorType.getShieldUpgrade();
    }
}
