package com.xavier.JavaTraining.exercises;

import java.util.Scanner;
import static java.lang.Math.abs;


public class JavaExercise {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Write a number: ");
        float number = input.nextFloat();
        input.close();

        if (number == 0){
            System.out.println("zero");
        }else if (number > 0){
            System.out.print("positive ");

        }else{
            System.out.print("negative ");
        }

        if (abs(number) < 1 && number != 0){
            System.out.print("small number");
        }
        else if (abs(number) > 1000000){
            System.out.print("large number");
        }
    }
}
