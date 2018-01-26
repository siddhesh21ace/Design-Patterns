package strategy.character;

import strategy.behavior.WeaponBehavior;

abstract public class Character {
    WeaponBehavior weaponBehavior;

    public abstract void fight();
}
