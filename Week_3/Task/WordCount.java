import java.util.Scanner;

public class WordCount {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String line = scanner.nextLine();
        
        String[] words = line.split("\\s+");
        int wordCount = words.length;
        
        System.out.println("The number of words is: " + wordCount);
    }
}

