
import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");

        // Read the entered number from the user
        int number = scanner.nextInt();

        // Check if the number is positive or negative
        if(number > 0){
            System.out.println(number + " is Positive");
        }
        else if(number < 0){
            System.out.println(number + " is Negative");
        }
        else{
            System.out.println("The number is Zero");
        }

        // Close the scanner
        scanner.close();
    }
}



