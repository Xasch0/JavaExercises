//Write a program in Java to display the pattern like right angle triangle with a number.
package com.xavier.JavaTraining.exercises;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Write the number of rows: ");
        int rows = input.nextInt();
        input.close();

        for(int i = 1; i <= rows; i++)
        {
            for(int ii = 1; ii <= i; ii++)
                System.out.print(ii);

            System.out.println("");
        }
    }
}
