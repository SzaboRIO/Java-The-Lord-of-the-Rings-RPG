package Entities;

import Items.MainWeapon;

/**
 * The Archer class represents an archer character in the game.
 * Archers are a specialized type of Hero that typically use bow weapons.
 * This class inherits all properties and behaviors from the Hero class.
 */
public class Archer extends Hero {

    /**
     * Constructs a new Archer with the specified attributes.
     * The archer is initialized with basic hero attributes and a weapon.
     *
     * @param name     The name of the archer
     * @param hp       The initial health points of the archer
     * @param strength The strength attribute of the archer, affecting attack power
     * @param gold     The initial amount of gold the archer possesses
     * @param weapon   The main weapon equipped by the archer, typically a bow
     */
    public Archer(String name, int hp, int strength, int gold, MainWeapon weapon) {
        super(name, hp, strength, gold, weapon);
    }

    /**
     * Copy constructor for creating a new Archer instance that is a copy of another Archer
     * to use when the user wants to play again with same character.
     *
     * @param other The Mage object to copy.
     */
    public Archer(Archer other) {
        super(other); // Call the superclass (Hero) copy constructor
    }

    /**
     * Creates and returns a copy of this Archer object.
     *
     * @return A new Archer object with the same attributes as this one.
     */
    @Override
    public Archer copy() {
        return new Archer(this);
    }
}