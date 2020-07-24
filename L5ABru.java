/*
Ashley Bruce
CIS 232 / Scovil
2.2.20
Lab 5
 */

import java.util.Random;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class L5ABru {

    public static void main (String [] args) {
        Random r = new Random();

        ArrayList<Integer> intArray = new ArrayList<>();
        ArrayList<Double> doubArray = new ArrayList<>();
        ArrayList<String> strArray = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            intArray.add(r.nextInt());
            doubArray.add(r.nextDouble());
            strArray.add (randomStringGenerator(8));
        }
        System.out.println ("UNSORTED LISTS");
        System.out.println ("--------------");
        System.out.println ("Random Integer ArrayList");
        printOutput(intArray);
        System.out.println ("Random Double ArrayList");
        printOutput(doubArray);
        System.out.println ("Random String ArrayList");
        printOutput(strArray);

        lab5Sort(intArray);
        lab5Sort(doubArray);
        lab5Sort(strArray);

        System.out.println ("SORTED LISTS");
        System.out.println ("------------");
        System.out.println ("Random Integer ArrayList");
        printOutput(intArray);
        System.out.println ("Random Double ArrayList");
        printOutput(doubArray);
        System.out.println ("Random String ArrayList");
        printOutput(strArray);

    }

    public static String randomStringGenerator (int length) {
        String possibleCharacters = "abcdefghijklmnopqrstuvwxyz" + "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                "1234567890";

        Random r = new Random();

        StringBuilder strbuild = new StringBuilder (length);

        for (int i = 0; i < length; i++) {
            int charIndex = (int) (possibleCharacters.length() * r.nextDouble());
            strbuild.append(possibleCharacters.charAt(charIndex));
        }

        return strbuild.toString();

    }

    public static void printOutput (ArrayList <?> array) {
        for (Object thing : array) {
            System.out.println (thing);
        }
        System.out.println (" ");
    }

    public static <AnyType extends Comparable<? super AnyType>> void lab5Sort(ArrayList<AnyType> gAL) {
        for (int i = 0; i < gAL.size() - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < gAL.size() - 1; j++) {
                if (gAL.get(j).compareTo(gAL.get(minIndex)) < 0)
                    minIndex = j;
            }

            AnyType temp = gAL.get(minIndex);
            gAL.set(minIndex, gAL.get(i));
            gAL.set(i, temp);
        }


    }
}

