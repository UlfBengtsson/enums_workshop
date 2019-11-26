package se.lexicon.skovde;

import se.lexicon.skovde.models.Dice;

public class App 
{
    public static void main( String[] args )
    {


    }

    public static void dice100()
    {
        for (int i = 0; i < 100; i++) {
            System.out.println( Dice.D100.rollDice() );
        }
    }
}
