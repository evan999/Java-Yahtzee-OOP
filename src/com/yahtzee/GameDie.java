package com.yahtzee;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class GameDie {

    private int[] values = new int[5];
    int min = 1;
    int max = 6;



    // dice = {1, 2, 3, 4, 5, 6}
    // private int value;
    Random random = new Random();


    public GameDie(){

    }



    public int[] rollDiceOnce(int[] values, int min, int max){

        values = generateRandomValues(values, min, max);
        /*
        for(int die = 0; die < values.length; die++) {

            //values[die] = random.nextInt(6);

            // Set the values of each of the dice
            // Call the object's setter.
            //dice.setValue(value);
            // How do we get the values for each die?
            values[die] = generateRandomValues(values);
            System.out.println(values[die]);
        }
        */
        return values;
    }

    public int[] getValue(){
        return values;
    }

    public void setValue(int[] values){
        this.values = values;
    }

    public int getRandomInRange(int min, int max){
        return min + random.nextInt(max - min + 1);
    }

    public int[] generateRandomValues(int[] values, int min, int max){
        for(int die = 0; die < values.length; die++){
            int rand = getRandomInRange(min, max);
            values[die] = rand;
            //System.out.println(rand);
        }
        return values;
    }


    public int[] rollSelectedDice(int[] values, int min, int max){
        // Take selected dice as input from the user.
        // How to determine selected dice?
        Scanner scanner = new Scanner(System.in);
        int dice = scanner.nextInt();

        // Have user enter indices of dice to re-roll.
        // Reroll indices user inputs
        // This might be simpler with an ArrayList.
        // Can call list.get(i) method on selected index numbers

        // int[] newDice = new int[dice];

        String[] userInput = new String[dice];

        // For each index the user selects
        //      Update the value in the array at that index
        // Convert the input to an integer

        int newLength = userInput.length;

        int[] updatedArray = new int[newLength];

        for(int die = 0; die < newLength; die++) {
            int curValue = Integer.parseInt(userInput[die]);
            curValue = getRandomInRange(min, max);
            updatedArray[die] = curValue;
            //System.out.println(newDice[die]);
        }

        // Handle user input
        // How many dice does the user want to re-roll?
        return updatedArray;

    }


}
