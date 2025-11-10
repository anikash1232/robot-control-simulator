package com.comp301.a07robot;

public class ArmsArmorDecorator extends RobotDecorator{
    final ArmorType armorType;

    public ArmsArmorDecorator(Robot decoratedRobot, ArmorType armorType){
        super(decoratedRobot);
        this.armorType = armorType;
    }


    @Override
    public String getDescription(){
        return super.getDescription() + ", " + armorType + " Arms Armor";
    }

    @Override
    public int getShield(){
        return super.getShield() + armorType.getShieldUpgrade();
    }

}
