interface StringFunction {
    String run(String str);
}

public class LambdaEx {
    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";  // Removed the extra space here
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}
