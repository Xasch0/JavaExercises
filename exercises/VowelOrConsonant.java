//Write a Java program that takes the user to provide a single character from the alphabet.
// Print Vowel or Consonant, depending on the user input.
// If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

package com.xavier.JavaTraining.exercises;

import java.util.Scanner;
import static java.lang.Character.isAlphabetic;

public class VowelOrConsonant {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input a letter from the alphabet: ");
        String letter = input.nextLine();

        input.close();

        if (!letter.matches("[A-Za-z]") || letter.length() > 1){
            System.out.println("Error! Invalid input.");
        }
        else if (letter.matches("[A-Z]")){
            System.out.println("The letter is a vowel.");
        }
        else if (letter.matches("[a-z]")){
            System.out.println("The letter is a consonant.");
        }

    }
}
