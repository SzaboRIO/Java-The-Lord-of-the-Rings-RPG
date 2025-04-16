package Entities;

import Items.MainWeapon;

/**
 * Represents a Warrior character in the game, a specific type of Hero.
 * Warriors are specialized hero characters typically characterized by their
 * physical combat prowess and durability.
 * This class extends the abstract Hero class, inheriting basic hero functionalities.
 */
public class Warrior extends Hero {

    /**
     * Constructs a new Warrior character with the specified attributes.
     *
     * @param name The warrior's name
     * @param hp The warrior's initial and maximum health points
     * @param strength The warrior's base strength attribute
     * @param gold The warrior's initial gold amount
     * @param weapon The warrior's initial main weapon
     */
    public Warrior(String name, int hp, int strength, int gold, MainWeapon weapon) {
        super(name, hp, strength, gold, weapon);
    }

    /**
     * Copy constructor for creating a new Warrior instance that is a copy of another Warrior
     * to use when the user wants to play again with same character.
     *
     * @param other The Warrior object to copy.
     */
    public Warrior(Warrior other) {
        super(other); // Call the superclass (Hero) copy constructor
    }

    /**
     * Creates and returns a copy of this Warrior object.
     *
     * @return A new Warrior object with the same attributes as this one.
     */
    @Override
    public Warrior copy() {
        return new Warrior(this);
    }
}