package strategy.character;

import strategy.behavior.WeaponBehavior;

public class Troll extends Character {
    public Troll(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
