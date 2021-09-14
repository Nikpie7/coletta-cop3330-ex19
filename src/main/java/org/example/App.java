/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        int height;
        while(true){
            System.out.print( "What is your height, in inches? " );
            try {
                height = Integer.parseInt( scan.nextLine() );
                break;
            }
            catch(Exception e) {
                System.out.println("Invalid input!");
                continue;
            }
        }

        int weight;
        while(true){
            System.out.print( "What is your weight, in pounds? " );
            try {
                weight = Integer.parseInt( scan.nextLine() );
                break;
            }
            catch(Exception e) {
                System.out.println("Invalid input!");
                continue;
            }
        }

        double BMI = (weight / (1.0 * height * height)) * 703;
        System.out.println( "Your BMI is " + BMI );

        if (BMI < 18.5)
            System.out.println( "You are underweight. You should see your doctor.." );
        else if (BMI < 25)
            System.out.println( "You are within the ideal weight range." );
        else
            System.out.println( "You are overweight. You should see your doctor." );

    }
}
