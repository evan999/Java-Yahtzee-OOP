package com.yahtzee;

public class Main {

    public static void main(String[] args) {
        // Allow functionality for a user to roll 5 dice 3 times
        // Cup = 5 dice
        // Roll each die a max of 3 times

        // First, roll all dice
        // On second roll, select dice to re-roll.
        // Take user input to roll selected dice.
        // Needs to allow between 1 and 5 dice to re-roll.
        // Each roll will mutate the value of the die.

        // Classes: GameDie, Player, Game
        // MVP : Complete implementation of one round of the game
        // Decide win (YAHTZEE!)

        GameDie die = new GameDie();

        //die.values = new int[5];

        //die.generateInitialValues(new int[5]);
        //die.rollDiceOnce(new int[]{2, 3, 5, 6, 1});
        //die.generateRandomValues(1, 6);
        //die.rollDiceOnce();

    }
}
