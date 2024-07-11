import java.util.Arrays;

public class Student {
    public  String studentId;
    public String name;
    public int age;
    public int[] grades;

    // Constructor
    public Student(String studentId, String name, int age, int[] grades) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    // Method to update grades
    public void updateGrades(int[] newGrades) {
        this.grades = newGrades;
        System.out.println("Grades updated for student " + name);
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grades: " + Arrays.toString(grades));
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        // Example usage
        int[] initialGrades = {90, 85, 88};
        Student student = new Student("S005", "Shikha Kumari", 20, initialGrades);

        // Displaying initial student information
        student.displayInfo();

        // Updating grades
        int[] newGrades = {95, 88, 92};
        student.updateGrades(newGrades);

        // Displaying updated student information
        student.displayInfo();
    }
}
