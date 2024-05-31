
import java.util.Scanner;


public class FirstPrime {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Nuber N: ");
        int N  = scanner.nextInt();

        int number = N + 1;
       
        while (true) {
            if (isPrime(number)) {
                System.out.println("The first prime number greater than " + N + " is: " + number);
                break;   
            }
            number++;

        }
    }
    public static boolean  isPrime(int num) {
        if (num <= 1) {
            return false;

        }
        for (int i = 2; i <=Math.sqrt(num); i++){
            if (num % i == 0) {
                return  false;
            }
        }
        return true;
    }
    
}
