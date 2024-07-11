import java.util.Scanner;

public class Student2 {
    // Private fields
    private String name;
    private String studentID;
    private int grade;

    // Constructor
    public Student2(String name, String studentID, int grade) {
        this.name = name;
        this.studentID = studentID;
        setGrade(grade);  // Use the setter to ensure grade is valid
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for studentID
    public String getStudentID() {
        return studentID;
    }

    // Setter for studentID
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    // Getter for grade
    public int getGrade() {
        return grade;
    }

    // Setter for grade, ensuring the grade is within the valid range
    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            throw new IllegalArgumentException("Grade must be between 0 and 100.");
        }
    }

    // Method to input student details
    public static Student2 inputStudentDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student ID: ");
        String studentID = scanner.nextLine();

        int grade = -1;
        while (true) {
            System.out.print("Enter student grade (0-100): ");
            try {
                grade = Integer.parseInt(scanner.nextLine());
                if (grade >= 0 && grade <= 100) {
                    break;
                } else {
                    System.out.println("Grade must be between 0 and 100. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 0 and 100.");
            }
        }

        return new Student2(name, studentID, grade);
    }

    public static void main(String[] args) {
        Student2 student = Student2.inputStudentDetails();
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Grade: " + student.getGrade());
    }
}
