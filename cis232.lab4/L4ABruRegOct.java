/*
Ashley Bruce
CIS 232 / Scovil
Lab 4
 */

package cis232.lab4;

import java.lang.Math;
import java.util.ArrayList;
import java.util.Random;


public class L4ABruRegOct extends Shape {

    private double sideLength;

    public L4ABruRegOct (double theSideLength) {

        sideLength = theSideLength;
    }

    public L4ABruRegOct () {

        sideLength = 1;
    }

    public double area() {

        return (2 * (1 + Math.sqrt(2)) * Math.pow(sideLength, 2));
    }

    public double perimeter () {

        return (sideLength * 8);
    }

    public double semiperimeter () {

        return (perimeter() / 2);
    }

    public double getArea () {

        return area();
    }

    public double getSideLength () {

        return sideLength;
    }

    public void setSideLength (double newSideLength) {
        sideLength = newSideLength;

    }

    public String toString () {

        return String.format("Octagon || " + " Side Length: %10f \t Area: %10f", sideLength, area());
    }

    public static void main (String [] args) {

        Random r = new Random();
        ArrayList<L4ABruRegOct> octArray = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            octArray.add(new L4ABruRegOct(r.nextDouble() * 10));
        }

        printOutput(octArray);

        lab4Sort(octArray);

        printOutput(octArray);

    }

    public static <E extends Comparable <? super E>> void lab4Sort (ArrayList <E> array) {

        for (int i = 0; i < array.size() - 1; i++) {
            int minIndex = i;

            for (int j = i+1; j < array.size(); j++) {
                if (array.get(j).compareTo(array.get(minIndex)) < 0 ) {
                    minIndex = j;
                }
            }

            E temp = array.get(minIndex);
            array.set(minIndex, array.get(i));
            array.set(i, temp);
        }
    }

    public static void printOutput (ArrayList <?> array) {
        for (Object thing : array) {
            System.out.println (thing);
        }
        System.out.println (" ");
    }
}




