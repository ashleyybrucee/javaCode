package cis232.a1;

import java.lang.Math;

//Circle

public class A1232ABruCircle extends Shape {

    private double radius;

    public A1232ABruCircle (double rad) {
        radius = rad;
    }

    public double area () {
        return Math.PI * radius * radius;
    }

    public double perimeter () {
        return 2 * Math.PI * radius;
    }

    public String toString () {
        return "Circle: " + radius;
    }

}



