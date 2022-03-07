package com.xavier.JavaTraining.exercises;

import java.util.Scanner;

public class SimpleTerminalCalculator {
    public static void main(String[] args) {
        // Creating the "Design" of the calculator
        System.out.println("    " + "CALCULATOR");
        for (int i = 0; i < 20; i++)
            System.out.print("-");

        System.out.println();
        System.out.println("[1] ADDITION");
        System.out.println("[2] SUBTRACTION");
        System.out.println("[3] MULTIPLICATION");
        System.out.println("[4] DIVISION");

        for (int i = 0; i < 20; i++)
            System.out.print("-");

        System.out.println();

        //Getting the inputs
        Scanner input = new Scanner(System.in);
        int option, firstNumber, secondNumber;

        System.out.println("Input the first number: ");;
        firstNumber = input.nextInt();

        System.out.println("Input the second number: ");
        secondNumber = input.nextInt();

        while (true){
            System.out.println("Select an option:");
            option = input.nextInt();
            if (option > 4 || option < 0){
                System.out.println("Invalid Option!");
            }
            else{
                break;
            }
        }

        //Doing the arithmetic operations
        if (option == 1) {
            System.out.printf("%d + %d = %d", firstNumber, secondNumber, firstNumber + secondNumber);
        }
        else if (option == 2) {
            System.out.printf("%d - %d = %d", firstNumber, secondNumber, firstNumber - secondNumber);
        }
        else if (option == 3) {
            System.out.printf("%d x %d = %d", firstNumber, secondNumber, firstNumber * secondNumber);
        }
        else if (option == 4){
            System.out.printf("%d / %d = %d", firstNumber, secondNumber, firstNumber / secondNumber);
        }
    }
}
