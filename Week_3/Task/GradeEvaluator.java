import java.util.Scanner;

public class GradeEvaluator {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score=scanner.nextInt();
        if(score>=90){
            System.out.println("Your Grade is A ");

        }
        else if(score>=80)
        {
            System.out.println("Your score  is B");



        }
        else if(score>=70)
        {
            System.out.println("Your score  is C");
            


        }
        else if(score>=60)
        {
            System.out.println("Your score  is D");
            


        }
        else 
        {
            System.out.println("Your score  is F");
            


        }
        scanner.close();

        }
    }

