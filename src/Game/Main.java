package Game;

import Adventure.MiddleEarth;
import Entities.Hero;

import java.io.FileNotFoundException;

import static Game.Game.createCharacter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        Hero currentHero = createCharacter();
        MiddleEarth middleEarth = new MiddleEarth(currentHero);
        middleEarth.start();

        Hero restoredHero = Game.getSavedHero();
        if (restoredHero != null) {
            MiddleEarth newMiddleEarth = new MiddleEarth(restoredHero);
            newMiddleEarth.start();
        }
    }
}
