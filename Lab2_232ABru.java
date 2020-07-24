/* Ashley Bruce
ashley_bruce1@my.cuesta.edu
CIS 232 / Scovil
1.22.19
Lab 2
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_232ABru {

    public static void main(String[] args) {

        ArrayList<Integer> intArr = new ArrayList<>();
        ArrayList<Double> doubArr = new ArrayList<>();
        ArrayList<String> strArr = new ArrayList<>();

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter any number of integers, doubles, or strings");
        System.out.println("Each item must be white-space delimited");
        System.out.println("Items that are not integers or doubles will be treated as strings");
        System.out.println("Terminate input by entering an empty line");
        System.out.println("--> ");

        String nextLine = userInput.nextLine();

        Scanner lineScan = new Scanner(nextLine);

        while (lineScan.hasNext()) {
            if (lineScan.hasNextInt()) {
                intArr.add(lineScan.nextInt());
            }
            else if (lineScan.hasNextDouble()) {
                doubArr.add(lineScan.nextDouble());
            }
            else {
                strArr.add(lineScan.next());
            }
        }


        selectionSort(intArr);
        selectionSort(doubArr);
        selectionSort(strArr);


        System.out.println ("Integers");
        System.out.println ("---------");
        if (intArr.isEmpty()) {
            System.out.println ("No integers were entered");
        }
        else {
            printOutput(intArr);
        }
        System.out.println(" ");

        System.out.println ("Doubles");
        System.out.println ("--------");
        if (doubArr.isEmpty()) {
            System.out.println ("No doubles were entered");
        }
        else {
            printOutput(doubArr);
        }
        System.out.println(" ");

        System.out.println ("Strings");
        System.out.println ("--------");
        if (strArr.isEmpty()) {
            System.out.print ("No strings were entered");
            System.out.println (" ");
        }
        else {
            printOutput(strArr);
        }


    }


    public static <E extends Comparable <E>> void selectionSort (ArrayList <E> array) {

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

        int count = 0;

        System.out.println("Number of items: " + array.size());

        for (Object thing : array) {
            count = count + 1;
            System.out.print(thing + " ");
            if (count == 10) {
                System.out.print("\n");
                count = 0;
            }
        }

        if (count != 0) {
            System.out.print("\n");

        }

    }

}
