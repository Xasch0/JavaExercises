//Write a program in Java to display the n terms of odd natural number and their sum.
package com.xavier.JavaTraining.exercises;

import java.util.Scanner;

public class NTermsOfOddNumbers {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Write number of terms: ");
        int terms = input.nextInt();
        input.close();

        int sum = 0;
        for(int i = 0, odd = 1; i < terms; i++){
            System.out.println(odd);
            sum += odd;
            odd += 2;
        }
        System.out.printf("The sum of odd Natural Number up to %d terms is: %d", terms, sum);
    }

}
