/*
Ashley Bruce
CIS 232 / Scovil
2.5.20
Lab 6
 */


import java.awt.Point;
import java.util.Comparator;
import java.util.Random;
import java.lang.Math;

public class L6_232ABru  {

    static class PointCompare {
        static class AscendingOrder implements Comparator <Point> {
            public int compare (Point point1, Point point2) {
                int p1x = point1.x;
                int p2x = point2.x;

                if (p1x != p2x) {
                    return p1x - p2x;
                }
                return point1.y - point2.y;
            }
        }

        static class DescendingOrder implements Comparator <Point> {
            public int compare (Point point1, Point point2) {
                int p1x = point1.x;
                int p2x = point2.x;

                if (p1x != p2x) {
                    return p2x - p1x;
                }
                return point2.y - point1.y;
            }
        }
    }


    public static <AnyType> void sort (AnyType [] arr, Comparator <? super AnyType> cmp) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;

            for (int j = i+1; j < arr.length; j++) {
                if (cmp.compare(arr[j], arr[index]) < 0) {
                    index = j;
                }
            }

            AnyType temp = arr [index];
            arr [index] = arr [i];
            arr [i] = temp;
        }

    }

    public static void main (String [] args) {
        Point [] pointArr = new Point [10];

        for (int i=0; i < 10; i++) {
            pointArr [i] = new Point (randomInt(), randomInt());
        }

        printOutput(pointArr, 2);

        sort (pointArr, new PointCompare.AscendingOrder ());

        System.out.println("Ascending Order");
        printOutput(pointArr, 2);

        sort(pointArr, new PointCompare.DescendingOrder ());

        System.out.println("Descending Order");
        printOutput(pointArr, 2);

    }

    public static int randomInt () {
        Random r = new Random ();

        return (r.nextInt(201) -100);
    }

    public static void printOutput (Object [] array, int numPerLine) {
        int count = 0;
        for (Object thing : array) {
            System.out.print (thing + "\t");
            count++;

            if (count == numPerLine) {
                System.out.print ("\n");
                count = 0;
            }
        }
        if (count != 0) {
            System.out.println(" ");
        }
        System.out.println (" ");
    }
}
