package com.xavier.JavaTraining.exercises;

import java.util.Scanner;

public class MinutesToYearAndDays {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Input the number of minutes: ");
        int minutes = input.nextInt();
        input.close();

        //Converting minutes into days and years
        int days = minutes / 1440;
        int years = days / 365;

        System.out.printf("%d minutes is equal to %d years and %d days.", minutes, years, (days % 365));

    }
}
