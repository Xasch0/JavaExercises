package com.xavier.JavaTraining.exercises;

import java.util.Scanner;

public class SumOfAllDigits {
    public static void main(String[] args){
        //Creating the input
        Scanner input = new Scanner(System.in);
        int integer = 0;
        do {
            System.out.println("Input a integer between 0 and 1000: ");
            integer = input.nextInt();
        }while (integer > 1000 || integer < 0);
        input.close();

        //Adding the digits
        int newInteger = integer;
        int sum = 0;
        while(newInteger > 0){

            int lastDigit = newInteger % 10;
            sum += lastDigit;
            newInteger /= 10;

        }
        System.out.printf("The sum of all digits in %d is %d",integer ,sum);
    }
}

