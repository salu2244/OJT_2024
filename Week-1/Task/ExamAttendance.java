import java.util.Scanner;

public class ExamAttendance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Taking input for the number of classes held
        System.out.print("Enter the number of classes held: ");
        int totalClasses = s.nextInt();

        // Taking input for the number of classes attended
        System.out.print("Enter the number of classes attended: ");
        int attendedClasses = s.nextInt();

        // Calculating the percentage of classes attended
        double attendancePercentage = (double) attendedClasses / totalClasses * 100;

        // Determining if the student is allowed to sit in the exam
        if (attendancePercentage >= 75) {
            System.out.println("Percentage of classes attended: " + attendancePercentage + "%");
            System.out.println("You are allowed to sit in the exam.");
        } else {
            System.out.println("Percentage of classes attended: " + attendancePercentage + "%");
            System.out.println("You are not allowed to sit in the exam due to low attendance.");
        }

        s.close();
    }
}
