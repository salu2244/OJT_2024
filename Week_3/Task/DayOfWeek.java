import java.util.Scanner;
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number(1-7):");
        int day = scanner.nextInt();
        switch(day){
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;

            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("Wednesday");
            break;

            case 5:
            System.out.println("Friday");
            break;

            case 6:
            System.out.println("Saturday");
            break;
            default:
            System.out.println("Invalid Input, Please enter the number between 1 to 7 ");


        }
        scanner.close();
    }
    
}
