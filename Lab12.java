/* Ashley Bruce */

public class Lab12 {
    public static void main (String [] args) {

        for (int i=1; i<=50; i++) {

            if (i%2 == 0)
                if (i%8 == 0 && i%3 ==0)
                    System.out.println (i + " is an even number and is divisible by 3 and 8");
                else if (i%3 == 0)
                    System.out.println (i + " is an even number and is divisible by 3");
                else if (i%8 == 0)
                    System.out.println (i + " is an even number and is divisble by 8");
                else
                    System.out.println (i + " is an even number");

            else
                if (i%8 == 0 && i%3 ==0)
                    System.out.println (i + " is an odd number and is divisible by 3 and 8");
                else if (i%3 == 0)
                    System.out.println (i + " is an odd number and is divisible by 3");
                else if (i%8 == 0)
                    System.out.println (i + " is an odd number and is divisble by 8");
                else
                    System.out.println (i + " is an odd number");
        }



    }
}

