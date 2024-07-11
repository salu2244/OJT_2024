
class Student {
    private String studentID;
    private int grade;

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

    // Setter for grade with validation
    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade, grade must be between 0 and 100");
        }
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentID("S12345");
        student.setGrade(85);

        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Grade: " + student.getGrade());

        // Test setting an invalid grade
        student.setGrade(105); // This should print an error message
        System.out.println("Grade after invalid set: " + student.getGrade());

        // Test setting another valid grade
        student.setGrade(95);
        System.out.println("Grade after valid set: " + student.getGrade());
    }
}
