package com.xavier.JavaTraining.exercises;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Number of rows: ");
        int diamondSize = input.nextInt();
        input.close();

        int spaces = diamondSize;
        int numberOfHashes = 1;

        for (int i = 0; i < diamondSize; i++)
        {
            for (int j = 1; j < spaces; j++)
                System.out.print(" ");
            for (int k = 0; k < numberOfHashes; k++)
                System.out.print("*");
            spaces--;
            numberOfHashes += 2;
            System.out.println();
        }

        numberOfHashes -= 2;
        for (int i = 0; i < diamondSize - 1; i++)
        {
            spaces++;
            numberOfHashes -= 2;
            for (int j = 0; j < spaces; j++)
                System.out.print(" ");
            for (int k = 0; k < numberOfHashes; k++)
                System.out.print("*");
            System.out.println();
        }
    }

}
