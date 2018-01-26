package strategy.character;

import strategy.behavior.WeaponBehavior;

public class Queen extends Character {
    public Queen(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
