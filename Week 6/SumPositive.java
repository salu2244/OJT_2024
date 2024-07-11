
import java.util.Scanner;

public class SumPositive {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum =0;
        while (true) { 
           System.out.println("Enter an integer (zero to stop): ");
            int number = scanner.nextInt();

            if (number == 0){
                break;
            }
            if (number < 0) {
                continue;
            }
            sum += number;
        }
        System.out.println("The sum of the positive number is: " + sum);

    }
    
}
