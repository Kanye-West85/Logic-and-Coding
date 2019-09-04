/**
 * Skeleton of a program that takes in the user's birth month and determines the number of days in the month
 *
 * @author Roy Chancellor
 * @version 2/6/2019
 */

import java.util.Scanner;  //enables user input

public class Birthday
{
    public static void main( String[] args) {
        //variable declarations
       double x;
       double y;
        //get user input
        Scanner keys = new Scanner(System.in);
        System.out.println("Enter your birth month");  //prompt the user for a birth month
       x = keys.nextInt();
        keys.close();
        
        //determine the number of days in the user's birth month
        if (x<12 && x>10)   
        
        //output the result to the user
        System.out.println("Your birth month has 30 days in it");
    }
}