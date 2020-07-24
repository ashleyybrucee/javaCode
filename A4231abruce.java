package main;/*
Ashley Bruce
CIS 231
Assignment 4
11/17/19
Randy Scovil
 */

import java.util.Scanner;
import java.util.ArrayList;

public class A4231abruce {

    public static void main (String [] args) {

        ArrayList<Integer> userArray = getUserInput();
        if (userArray.isEmpty()) {
            System.out.println ("You have entered no numbers");
        }
        else {
            selectionSort (userArray);
            printOutput(userArray);
        }


    }

    public static ArrayList <Integer> getUserInput () {
        Scanner keyIn = new Scanner(System.in);
        ArrayList<Integer> inputArray = new ArrayList<Integer>();

        System.out.println ("Enter any number of values, separated by white space");
        System.out.println ("All values must be white-space delimited");
        System.out.println ("Non-integer values will be discarded");
        System.out.println ("Terminate input by entering an empty line");
        System.out.println ("--> ");


        String nextLine = keyIn.nextLine ();

        Scanner lineScan = new Scanner (nextLine);

        while (lineScan.hasNext()) {
            if (lineScan.hasNextInt()) {
                inputArray.add (lineScan.nextInt());
            }
            else {
                lineScan.next();
            }
        }

        return inputArray;
    }


   public static void selectionSort (ArrayList <Integer> array) {

        for (int i = 0; i < array.size() - 1; i++) {
            int minIndex = i;

            for (int j = i+1; j < array.size(); j++) {
                if (array.get(j) < array.get(minIndex)) {
                    minIndex = j;
                }
            }

            int temp = array.get(minIndex);
            array.set(minIndex, array.get(i));
            array.set(i, temp);
        }
   }

   public static void printOutput (ArrayList <Integer> sortedArray) {
       System.out.println("\nA total of " + sortedArray.size() + " integers were entered. \n");

       for (Integer next : sortedArray) {
           System.out.print(next + " ");
           if (sortedArray.indexOf(next) % 10 == 9) {
               System.out.print("\n");
           }
       }
       if (sortedArray.size() % 10 != 0) {
           System.out.print("\n");
       }
       System.out.println ();

       System.out.println ("The lowest value input: " + sortedArray.get(0) + "\n");
       System.out.println ("The highest value input: " + sortedArray.get(sortedArray.size()-1) + "\n");

       double average = findAverage (sortedArray);
       System.out.format ("The average of all the values was %.2f \n\n", average);

       mode (sortedArray);

   }


   public static double findAverage (ArrayList <Integer> array) {
        double sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum = sum + array.get(i);
        }

       return (sum / array.size());
   }



   public static void mode (ArrayList <Integer> array) {

       ArrayList <Integer> modes = new ArrayList<>();

       int maxCount = 0;
       int count = 1;
       for (int i = 0; i < array.size() -1; i++) {
           if (array.get (i) == array.get(i+1)) {
               count = count + 1;
           }
           else {
               count = 1;
           }
           if (count > maxCount) {
               maxCount = count;
               modes.clear();
               modes.add (array.get(i));
           }
           else if (count == maxCount) {
               modes.add (array.get (i));
           }
       }

       if (maxCount == 1) {
           System.out.println ("There is no mode in the data set, all numbers occurred the same amount of times \n");
       }

       else if (modes.size() == 1) {
           System.out.println (modes.get(0) + " was the mode, which occurred " + maxCount + " times");
       }

       else {
           for (int i = 0; i < modes.size(); i++) {
               System.out.print(modes.get(i) + ", ");
           }
           System.out.print("were the modes, which occurred " + maxCount + " times each ");
       }

   }

}

