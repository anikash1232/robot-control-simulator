package com.comp301.a07robot;

public enum PowerType {
  APPRENTICE(1),
  ENCHANTER(2),
  SORCERER(3);

  private final int multiplier;

  PowerType(int multiplier) {
    this.multiplier = multiplier;
  }

  public int getMultiplier() {
    return multiplier;
  }

  @Override
  public String toString() {
    return name();
  }
}
