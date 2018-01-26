package strategy.character;

import strategy.behavior.WeaponBehavior;

public class King extends Character {
    public King(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
