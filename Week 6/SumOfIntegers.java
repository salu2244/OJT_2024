import java.util.Scanner;

public class SumOfIntegers {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        while (true) {
            System.out.print("Enter an integer (negative number to stop): ");
            int number = scanner.nextInt();
            
            if (number < 0) {
                break;
            }
            
            sum += number;
        }
        
        System.out.println("The sum of the numbers is: " + sum);
    }
}
