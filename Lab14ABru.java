package main;
/*
Ashley Bruce
CIS 231
11/17/19
Lab 14
 */

import java.util.Random;

public class Lab14ABru {

    public static final int NUM_VALUES = 15;
    public static final int MAX_VALUE = 1000;


    public static void main (String [] args) {

        System.out.println ("Ashley Bruce");
        System.out.println ("This program generates an array of " + NUM_VALUES+ " random numbers");
        System.out.println ("The random number generator generates numbers up to " + MAX_VALUE + "\n");
        int [] data = randomNumberArray(NUM_VALUES);
        printArray(data, 4);
        System.out.println ("\nThe highest number in the array is " + findLargest (data));
    }

    public static int [] randomNumberArray (int amount) {

        Random r = new Random ();
        int [] randomArray = new int [amount];

        for (int i=0; i < randomArray.length; i++) {
            randomArray[i] = r.nextInt(MAX_VALUE);
        }
        return (randomArray);
    }

    public static void printArray (int [] array, int numPerLine) {

        for (int i = 0; i < array.length; i++) {
            System.out.print (array [i] + " ");
            if (i % numPerLine == numPerLine - 1) {
                System.out.print ("\n");
            }
        }

        if (array.length % numPerLine != 0) {
            System.out.print("\n");
        }
    }

    public static int findLargest (int [] array) {

        int highestNum = array [0];

        for (int i = 1; i < array.length; i++) {
            if (highestNum < array[i]) {
                highestNum = array [i];
            }
        }
        return (highestNum);
    }
}
