
import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Prompt the user to enter their annual income
        System.out.print("Enter your annual income: ");
        double income = scanner.nextDouble();

        // Determine loan eligibility based on age and income
        if (age < 18) {
            System.out.println("Not eligible for a loan.");
        } else if (age >= 18 && age <= 25) {
            if (income >= 25000) {
                System.out.println("Eligible for a small loan.");
            } else {
                System.out.println("Not eligible for a loan.");
            }
        } else if (age >= 26 && age <= 35) {
            if (income >= 50000) {
                System.out.println("Eligible for a medium loan.");
            } else {
                System.out.println("Not eligible for a loan.");
            }
        } else if (age > 35) {
            if (income >= 75000) {
                System.out.println("Eligible for a large loan.");
            } else {
                System.out.println("Not eligible for a loan.");
            }
        } else {
            System.out.println("Invalid input.");
        }

        // Close the scanner
        scanner.close();
    }
}

