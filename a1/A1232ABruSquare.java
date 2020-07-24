package cis232.a1;

// Square

public class A1232ABruSquare extends Shape {

    private double sideLength;

    public A1232ABruSquare (double theSideLength) {
        sideLength = theSideLength;
    }

    public double area () {
        return sideLength * sideLength;
    }

    public double perimeter () {
        return 4 * sideLength;
    }

    public String toString () {
        return "Square: " + sideLength;
    }

}
