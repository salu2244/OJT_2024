import java.util.Scanner;

public class AgeComparison {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Taking input for the age of three people
        System.out.println("Enter the age of the first person:");
        int age1 = s.nextInt();
        System.out.println("Enter the age of the second person:");
        int age2 = s.nextInt();
        System.out.println("Enter the age of the third person:");
        int age3 = s.nextInt();

        // Determining the oldest and youngest ages
        int oldestAge = Math.max(age1, Math.max(age2, age3));
        int youngestAge = Math.min(age1, Math.min(age2, age3));

        // Printing the results
        System.out.println("The oldest person is " + oldestAge + " years old.");
        System.out.println("The youngest person is " + youngestAge + " years old.");

        s.close();
    }
}
