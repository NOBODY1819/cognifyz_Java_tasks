/*
Task: Palindrome Checker

Description: Implement a program that checks whether a given word or phrase is a palindrome. A palindrome is a word or phrase that reads the same forwards and backward, ignoring spaces and punctuation. */

package cognifyz_Java_tasks.Level_1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = input.nextLine().toLowerCase();
        str = str.replace(",", "");
        str = str.replace(".", "");
        str = str.replace("!", "");
        str = str.replace("?", "");
        str = str.replace(" ", "");
        System.out.println(str);
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
                continue;
            }
            System.out.println("String is not Palindrome");
            break;
        }
        if (i >= j) {
            System.out.println("String is Paindrome");
        }
        input.close();
    }
}
