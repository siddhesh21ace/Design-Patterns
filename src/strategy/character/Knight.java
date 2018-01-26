package strategy.character;

import strategy.behavior.WeaponBehavior;


public class Knight extends Character {
    public Knight(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
