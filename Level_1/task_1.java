/*
Task: Temperature Converter

Description: Create a program that converts temperatures between Celsius and Fahrenheit. Prompt the user to enter a temperature value and the unit of measurement, and then perform the conversion. Display the converted temperature. */

package cognifyz_Java_tasks.Level_1;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        System.out.println("Temperature Converter");
        Scanner input = new Scanner(System.in);
        double celsius, fahrenheit;
        System.out.print("Enter:\na -> For Celsius to Fahrenheit\nb -> For Fahrenheit to Celsius\t:");
        char choice = input.next().charAt(0);
        
        if (choice=='a' || choice =='A') {
            // celsius to fahrenheit
            System.out.print("Enter temperature value in Celsius: ");
            celsius= input.nextDouble();
            fahrenheit = (celsius*(9.0/5.0)) + 32;
            System.out.format("%.2f°C = %.2f°F",celsius,fahrenheit);
        } else if (choice=='b' || choice =='B') {
            // fahrenheit to celsius
            System.out.print("Enter temperature value in Fahrenheit: ");
            fahrenheit = input.nextDouble();
            celsius = (fahrenheit-32)*(5.0/9.0);
            System.out.format("%.2f°F = %.2f°C", fahrenheit,celsius);
        }else{
            System.out.println("Invalid Input!");
        }
        
        input.close();
    }    
}
