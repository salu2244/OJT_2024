import java.util.Scanner;

public class Medical {
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

        // Asking if the student has a medical cause
        System.out.print("Do you have a medical cause? (Y/N): ");
        char medicalCause = s.next().charAt(0);

        // Determining if the student is allowed to sit in the exam
        if (medicalCause == 'Y' || medicalCause == 'y') {
            System.out.println("Percentage of classes attended: " + attendancePercentage + "%");
            System.out.println("You are allowed to sit in the exam due to a medical cause.");
        } else {
            if (attendancePercentage >= 75) {
                System.out.println("Percentage of classes attended: " + attendancePercentage + "%");
                System.out.println("You are allowed to sit in the exam.");
            } else {
                System.out.println("Percentage of classes attended: " + attendancePercentage + "%");
                System.out.println("You are not allowed to sit in the exam due to low attendance.");
            }
        }

        s.close();
    }
}

