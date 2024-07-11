abstract class Sunstar {
    abstract void printInfo();
}

class Employee extends Sunstar {
    void printInfo() {
        String name = "Shikha";
        int age = 21;
        float salary = 222.2F;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Sunstar s = new Employee();
        s.printInfo();
    }
}
