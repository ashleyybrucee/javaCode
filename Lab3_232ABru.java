/*
Ashley Bruce
ashley_bruce1@my.cuesta.edu
1.25.19
CIS 232 / Scovil
Lab 3
 */

import java.util.regex.PatternSyntaxException;

public class Lab3_232ABru {

    private int month;
    private int day;
    private int year;

    public Lab3_232ABru () {
        month = 1;
        day = 1;
        year = 2018;
    }

    public Lab3_232ABru (int theMonth, int theDay, int theYear) {
        month = theMonth;
        day = theDay;
        year = theYear;
    }

    public Lab3_232ABru (String strDate) {

        try {
            String [] dateArray = strDate.split(" ");

            month = Integer.parseInt(dateArray[0]);
            day = Integer.parseInt (dateArray[1]);
            year = Integer.parseInt(dateArray[2]);

        }

        catch (NumberFormatException | PatternSyntaxException | ArrayIndexOutOfBoundsException e) {
            month = 1;
            day = 1;
            year = 2018;
        }

    }

    public int getDay () {
        return day;
    }

    public int getMonth () {
        return month;
    }

    public int getYear () {
        return year;
    }

    public void setDay (int newDay) {
        day = newDay;
    }

    public void setMonth (int newMonth) {
        month = newMonth;
    }

    public void setYear (int newYear) {
        year = newYear;
    }

    public boolean equals (Object rhs) {

        if (! (rhs instanceof Lab3_232ABru))
            return false;
        Lab3_232ABru rhDate = (Lab3_232ABru) rhs;

        return ((rhDate.month == month) && (rhDate.day == day) && (rhDate.year == year));
    }

    public String toString () {
        return month + "/" + day + "/" + year;
    }

    public static void main (String [] args) {
        Lab3_232ABru d1 = new Lab3_232ABru ();
        Lab3_232ABru d2 = new Lab3_232ABru (1, 1, 2016);
        Lab3_232ABru d3 = new Lab3_232ABru (8, 18, 2010);
        Lab3_232ABru d4 = new Lab3_232ABru ("10 10 2010");
        //Lab3_232ABru d5 = new Lab3_232ABru ("cheese balls");

        d1.setYear(2010);
        d1.setMonth(8);
        d1.setDay(18);

        System.out.println ("Date 1: " + d1);
        System.out.println ("Date 2: " + d2);
        System.out.println ("Date 3: " + d3);
        System.out.println ("Date 4: " + d4);
        //System.out.println ("Date 5: " + d5);

        System.out.println ("Date1 == Date2?: " + d1.equals(d2));
        System.out.println ("Date1 == Date3?: " + d1.equals(d3));
        System.out.println ("Date3 == Date4?: " + d4.equals(d3));

        System.out.println ("Date 1's year is: " + d1.getYear());
        System.out.println ("Date 1's month is: " + d1.getMonth());
        System.out.println ("Date 1's day is: " + d1.getDay());

        System.out.println ("Date 4's year is: " + d4.getYear());
        System.out.println ("Date 4's month is: " + d4.getMonth());
        System.out.println ("Date 4's day is: " + d4.getDay());
    }


}




