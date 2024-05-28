import java.util.Scanner;

public class Ans2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Quantity:");
        int x = s.nextInt();

        if ((x * 100) > 1000) {
            double discount = 0.1 * x * 100;
            double totalCost = x * 100 - discount;
            System.out.println("You get a discount of " + discount + " and your total cost is " + totalCost);
        } else {
            System.out.println("No discount.");
        }
        s.close();
    }
}
