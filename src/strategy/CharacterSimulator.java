package strategy;

import strategy.behavior.AxeBehavior;
import strategy.behavior.BowAndArrowBehavior;
import strategy.behavior.KnifeBehavior;
import strategy.behavior.SwordBehavior;
import strategy.character.Character;
import strategy.character.*;

public class CharacterSimulator {
    public static void main(String args[]) {
        Character character;

        character = new King(new SwordBehavior());
        character.fight();

        character = new Queen(new KnifeBehavior());
        character.fight();

        character = new Knight(new BowAndArrowBehavior());
        character.fight();

        character = new Troll(new AxeBehavior());
        character.fight();
    }
}
