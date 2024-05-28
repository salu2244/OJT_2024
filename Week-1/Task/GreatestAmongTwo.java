import java.util.Scanner;

public class GreatestAmongTwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Prompting user to enter the first integer
        System.out.print("Enter the first integer: ");
        int num1 = s.nextInt();

        // Prompting user to enter the second integer
        System.out.print("Enter the second integer: ");
        int num2 = s.nextInt();

        // Comparing the two integers
        if (num1 > num2) {
            System.out.println("The greatest number is: " + num1);
        } else if (num2 > num1) {
            System.out.println("The greatest number is: " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }

        s.close();
    }
}
