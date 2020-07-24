package cis232.a1;

// Hexagon

import java.lang.Math;

public class A1232ABruRegularHexagon extends Shape {

    private double sideLength;

    public A1232ABruRegularHexagon (double theSideLength) {
        sideLength = theSideLength;
    }

    public double area() {
        return (3 / 2 * Math.sqrt(3) * sideLength * sideLength);
    }

    public double perimeter () {
        return 6 * sideLength;
    }

    public String toString () {
        return "Hexagon: " + sideLength;
    }


}
