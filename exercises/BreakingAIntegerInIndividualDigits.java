package com.xavier.JavaTraining.exercises;

import java.util.Scanner;

public class BreakingAIntegerInIndividualDigits {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Write six non-negative digits: ");
        int digits = input.nextInt();
        input.close();

        String convertedInteger = Integer.toString(digits);
        for(int i = 0; i < 6; i++){
            System.out.printf("%s ",convertedInteger.charAt(i));
        }
    }
}
