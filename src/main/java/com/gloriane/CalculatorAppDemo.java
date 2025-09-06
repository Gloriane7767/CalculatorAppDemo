package com.gloriane;

import java.util.Scanner;

public class CalculatorAppDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Tool to read what user types
        boolean keepRunning = true;                // Flag to control the loop

        System.out.println("Welcome to Calculator!");

        // Main loop - keeps running until the user wants to quit
        while (keepRunning) {
            try {
                // Get first number from a user
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();

                // Get operation from a user
                System.out.print("Enter operation (+, -, *, /): ");
                char operation = scanner.next().charAt(0);

                // Get second number from user
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                double result = 0;  // Variable to store answer

                // Switch statement with math logic inside each case
                switch (operation) {
                    case '+':
                        result = num1 + num2;  // Addition logic directly here
                        break;
                    case '-':
                        result = num1 - num2;  // Subtraction logic directly here
                        break;
                    case '*':
                        result = num1 * num2;  // Multiplication logic directly here
                        break;
                    case '/':
                        if (num2 == 0) {       // Check for division by zero
                            System.out.println("Error: Cannot divide by zero!");
                            continue;          // Go back to start of loop
                        }
                        result = num1 / num2;  // Division logic directly here
                        break;
                    default:
                        System.out.println("Invalid operation!");
                        continue;  // Go back to start of loop
                }

                // Show the result
                System.out.println("Result: " + result);

            } catch (Exception e) {  // Catch any errors
                System.out.println("Error: Invalid input!");
                scanner.nextLine();  // Clear bad input
            }

            // Ask if user wants to continue
            System.out.print("Continue? (y/n): ");
            String choice = scanner.next();

            // If user doesn't type 'y', stop the program
            if (!choice.equalsIgnoreCase("y")) {
                keepRunning = false;
            }
        }

        System.out.println("Goodbye!");
        scanner.close();  // Close the scanner
    }
}
