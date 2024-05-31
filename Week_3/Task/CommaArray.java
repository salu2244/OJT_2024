import java.util.Arrays;
import java.util.Scanner;

public class CommaArray {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Comma-Seprated in String of Number: ");
        String input=scanner.nextLine();

        String[] numberStrings = input.split(",");
        int[] numbers = new int[numberStrings.length];
        
        for (int i = 0; i < numberStrings.length; i++) {
            numbers[i] = Integer.parseInt(numberStrings[i].trim());
        }
        
        System.out.println("The array of integers is: " + Arrays.toString(numbers));



    }
    
}
