public class Student {
    // Private fields
    private String name;
    private String studentId;
    private int grade;

    // Constructor
    public Student(String name, String studentId, int grade) {
        this.name = name;
        this.studentId = studentId;
        setGrade(grade); // Use setter to validate initial grade
    }

    // Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for studentId
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Getter and setter for grade with validation
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Student student = new Student("Shikha Kumari", "45678", 90);
        System.out.println(student.getName());       
        System.out.println(student.getStudentId());  
        System.out.println(student.getGrade());      

        student.setGrade(95);
        System.out.println(student.getGrade());      // Output: 95

        try {
            student.setGrade(105);                  // This will throw an IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());     // Output: Grade must be between 0 and 100
        }
    }
}
