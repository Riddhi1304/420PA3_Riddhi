package com.classwork;
import java.util.Scanner;

public class getValidintedInt {
    public static int getValidatedInt(Scanner scanner, String prompt, String errorMessage, int min, int max) {
        int value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value >= min && value <= max) {
                    return value;
                } else {
                    System.out.println("Error: " + errorMessage);
                }
            } else {
                System.out.println("Error: " + errorMessage);
                scanner.next(); // Consume invalid input
            }
        }
    }
}
