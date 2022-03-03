/* Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a number in a row.The pattern is as follows.
1
22
333
4444
 */
package com.xavier.JavaTraining.exercises;

import java.util.Scanner;

public class Triangle2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Write the number of rows: ");
        int rows = input.nextInt();
        input.close();

        for (int row = 1; row <= rows; row++)
        {
            for (int digit = 1; digit <= row; digit++)
                System.out.print(row);

            System.out.println();
        }

    }
}
