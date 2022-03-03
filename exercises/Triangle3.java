/*
Write a program in Java to make such a pattern like right angle triangle with number increased by 1.The pattern like :
1
2 3
4 5 6
7 8 9 10
 */
package com.xavier.JavaTraining.exercises;

import java.util.Scanner;

public class Triangle3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Write the number of rows: ");
        int numberOfLines = input.nextInt();
        input.close();

        int number = 1;
        for (int row = 1; row <= numberOfLines; row++)
        {
            for (int digit = 1; digit <= row; digit++)
                System.out.print(number++ + " ");

            System.out.println();
        }
    }
}
