package cis232.a1;

// Octagon

import java.lang.Math;

public class A1232ABruRegularOctagon extends Shape {

    private double sideLength;

    public A1232ABruRegularOctagon (double theSideLength) {
        sideLength = theSideLength;
    }

    public double area () {
        return (2 * (1 + Math.sqrt(2)) * sideLength * sideLength);
    }

    public double perimeter () {
        return 8 * sideLength;
    }

    public String toString () {
        return "Octagon: " + sideLength;
    }

}
