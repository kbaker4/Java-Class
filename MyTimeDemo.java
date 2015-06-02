/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework3;

/**
 * MyTimeDemo - tests the MyTime class
 *
 * The MyTime class must be compiled before this class can be compiled.
 */
import java.util.Scanner;
public class MyTimeDemo
{
    /**
     * main
     */
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Create a MyTime object and set to noon (12 PM).
        MyTime noon = new MyTime();
        noon.setTime(12, 0, 0);

        MyTime wakeup = new MyTime();
        wakeup.setTime(6, 30, 0);

        // Ask for time to be input, then create a new MyTime and set the time
        int inHour, inMinute, inSecond;
        do {
            System.out.println();
            System.out.println("Enter hour minute and second (-1 to exit)");
            inHour = sc.nextInt();
            if (-1 == inHour)
                break;
            inMinute = sc.nextInt();
            inSecond = sc.nextInt();
            System.out.println();
            System.out.println("Values read were: " + inHour + " " +
                               inMinute + " " + inSecond);

            // Create a new MyTime object
            MyTime t = new MyTime();

            // Set the time to the time read from the keyboard
            t.setTime(inHour,inMinute,inSecond);

            System.out.println(t.toString());
            System.out.println(t.toUniversalString());
            System.out.println("hour is " + t.getHour() + "  minute is " +
                                t.getMinute() + "  second is " + t.getSecond());

            // Test if the time read matches the 'noon' MyTime object's value.
            if (t.equals(noon))
                System.out.println("Matches noon time");
            // Test if the time read matches the 'wakeup' MyTime object's value
            if (t.equals(wakeup))
                System.out.println("It's time to wakeup!");

        } while (-1 != inHour);

        // Keep console window alive until 'enter' pressed (if needed).
        System.out.println();
        System.out.println("Done - press enter key to end program");
        String junk = sc.nextLine();
    }
}