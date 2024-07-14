/*
 * Task: Random Password Generator

Description: Build a program that generates a random password for the user. Prompt the user to enter the desired length of the password and specify whether it should include numbers, lowercase letters, uppercase letters, and special characters. Generate the password accordingly and display it to the user.
 */
package cognifyz_Java_tasks.Level_1;

import java.util.*;

public class task_4 {
    public static void main(String[] args) {
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length of Passward : ");
        int length = input.nextInt();
        if (length > 1) {

            String passwoardString = new String("");
            System.out
                    .print("Enter 1 for True/Yes and 0 for False/No \nDoes the passwoard include lowercase letters : ");
            int b = input.nextInt();
            if (b == 1) {
                passwoardString += Small_chars;
            }
            System.out.print("Does the passwoard include Uppercase letters : ");
            b = input.nextInt();
            if (b == 1) {
                passwoardString += Capital_chars;
            }
            System.out.print("Does the passwoard include Special letters : ");
            b = input.nextInt();
            if (b == 1) {
                passwoardString += symbols;
            }
            System.out.print("Does the passwoard include Numbers : ");
            b = input.nextInt();
            if (b == 1) {
                passwoardString += numbers;
            }

            Random rand = new Random();
            String passwoard = "";
            for (int i = 0; i < length; i++) {
                passwoard += passwoardString.charAt(rand.nextInt(passwoardString.length()));
            }
            System.out.println("Generated Passowrd is : " + passwoard);

        } else {
            System.out.println("Password length too short");
        }
    }
}
