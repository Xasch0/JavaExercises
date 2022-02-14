////Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places.

package com.xavier.JavaTraining.exercises;

import java.util.Scanner;

public class ThreeDecimalPlaces {
    public static void main(String[] args){

        //Getting the user input
        Scanner input = new Scanner(System.in);

        System.out.println("Input a floating number with three decimal places: ");
        double number1 = input.nextDouble();
        System.out.println("Input another floating number with three decimal places: ");
        double number2 = input.nextDouble();
        input.close();

        //Getting the numbers in the decimal places
        int firstNumberDecimal = (int) ((number1 * 1000) % 1000);
        int secondNumberDecimal= (int) ((number2 * 1000) % 1000);

        //Comparing the two numbers
        if (firstNumberDecimal == secondNumberDecimal){
            System.out.println("They are equal.");
        }
        else{
            System.out.println("They are different.");
        }
    }
}
