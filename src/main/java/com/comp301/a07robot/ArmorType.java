package com.comp301.a07robot;

public enum ArmorType {
  BRONZE(10),
  IRON(15),
  GOLD(20),
  DIAMOND(25);

  private final int shieldUpgrade;

  ArmorType(int shieldUpgrade) {
    this.shieldUpgrade = shieldUpgrade;
  }

  public int getShieldUpgrade() {
    return shieldUpgrade;
  }

  @Override
  public String toString() {
    return name();
  }
}
