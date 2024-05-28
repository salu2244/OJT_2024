import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking the user for their salary
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        // Asking the user for their years of service
        System.out.print("Enter your years of service: ");
        int yearsOfService = scanner.nextInt();

        // Calculating bonus based on years of service
        double bonus = 0.0;
        if (yearsOfService > 5) {
            bonus = 0.05 * salary; // 5% of the salary
        }

        // Printing the net bonus amount
        System.out.println("Your bonus amount is: " + bonus);

        scanner.close();
    }
}


