public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum1 = calc.add(5, 3); 
        double sum2 = calc.add(2.5, 4.3);
        int sum3 = calc.add(4, 6, 8); // Corrected method call

        System.out.println("Sum of 3 numbers: " + sum3);
        System.out.println("Sum of integers: " + sum1);
        System.out.println("Sum of doubles: " + sum2);
    }
}
