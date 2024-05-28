import java.util.Scanner;

public class Whether {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Asking the user to enter a character
        System.out.print("Enter a character: ");
        char ch = s.next().charAt(0);

        // Checking if the entered character is lowercase
        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase character.");
        }
        // Checking if the entered character is uppercase
        else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase character.");
        }
        // If the entered character is neither lowercase nor uppercase
        else {
            System.out.println(ch + " is not a valid alphabetical character.");
        }

        s.close();
    }
}
    
    

