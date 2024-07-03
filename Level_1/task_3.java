/*
 Task: Student Grade Calculator

Description: create a program that calculates and displays the average grade of a student. Prompt the user to enter the number of grades to be entered, and then input each grade. Calculate the average and display it to the user.
 */
package cognifyz_Java_tasks.Level_1;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of grades : ");
        int grades = input.nextInt();
        float total = 0, marks[] = new float[grades];
        for (int i = 0; i < grades; i++) {
            System.out.print("Enter grade " + (i + 1) + " : ");
            marks[i] = input.nextFloat();
            total += marks[i];
        }
        System.out.format("Average Grade : %.2f", (total / grades));
        input.close();
    }
}
