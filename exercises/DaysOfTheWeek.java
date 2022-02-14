package com.xavier.JavaTraining.exercises;


import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Input the weekday(as a number): ");
        int weekDay = input.nextInt();
        input.close();
        String weekDayString;
        switch (weekDay) {
            case 1 -> weekDayString = "Monday";
            case 2 -> weekDayString = "Tuesday";
            case 3 -> weekDayString = "Wednesday";
            case 4 -> weekDayString = "Thursday";
            case 5 -> weekDayString = "Friday";
            case 6 -> weekDayString = "Saturday";
            case 7 -> weekDayString = "Sunday";
            default -> weekDayString = "Invalid day number.";
        }

        System.out.println(weekDayString);
    }
}
