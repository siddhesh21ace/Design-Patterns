package strategy.behavior;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Kill with a Knife!");
    }
}
