package se.lexicon.skovde.models;

import java.util.Random;

public enum Dice {
    D6(6),
    D10(10),
    D20(20),
    D100(100);

    private int maxRoll;

    private Dice(int maxRoll) {
        this.maxRoll = maxRoll;
    }

    //private static Random rng = new Random();

    public int rollDice()
    {
        //return rng.nextInt(maxRoll) + 1;
        return (int)( Math.random() * maxRoll ) + 1;
    }
}
