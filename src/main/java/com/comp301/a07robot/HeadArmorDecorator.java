package com.comp301.a07robot;

public class HeadArmorDecorator extends RobotDecorator{
    final ArmorType armorType;

    public HeadArmorDecorator(Robot decoratedRobot, ArmorType armorType){
        super(decoratedRobot);
        this.armorType = armorType;
    }


    @Override
    public String getDescription(){
        return super.getDescription() + ", " + armorType + " Head Armor";
    }

    @Override
    public int getShield(){
        return super.getShield() + armorType.getShieldUpgrade();
    }

}
