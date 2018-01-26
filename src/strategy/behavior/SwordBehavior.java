package strategy.behavior;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Kill with a Sword!");
    }
}
