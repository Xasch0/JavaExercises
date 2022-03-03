/*
    Write a program in Java to make such a pattern like a pyramid with a number which will repeat the number in the same row.
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
 */
package com.xavier.JavaTraining.exercises;

import java.util.Scanner;

public class Triangle4  {
    public static void main(String[] args)

    {
        Scanner input = new Scanner(System.in);
        System.out.println("Write the number of rows: ");
        int rows = input.nextInt();
        input.close();

        for (int row = 1, spaces = rows + 4; row <= rows; row++, spaces--){
            for (int i = 0; i < spaces; i++)
                System.out.print(" ");
            for (int digits = 1; digits <= row; digits++)
                System.out.print(row + " ");
            System.out.println();
        }
    }
}

