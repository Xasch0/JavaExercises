// Write a Java program to find the number of days in a month.

package com.xavier.JavaTraining.exercises;

import java.time.Month;
import java.util.Scanner;

public class NumberOfDaysInAMonth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int month;
        do {
            System.out.println("Input a month number: ");
            month = input.nextInt();
        }while(month > 12 || month < 0);

        System.out.println("Input a year: ");
        int year = input.nextInt();

        input.close();

        int days;
        switch (month){
            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
                break;
            case 4, 6, 9, 11:
                days = 30;
                break;
            case 2:
                if (year % 1000 != 0 && year % 4 == 0 || year % 1000 == 0 && year % 400 == 0){
                    days = 29;
                }
                else{
                    days = 28;
                }
                break;
            default:
                days = 2;
        }
        String nameOfTheMonth = Month.of(month).name().toLowerCase();

        System.out.printf("%s of %d has %d days.",nameOfTheMonth, year, days);
    }
}
