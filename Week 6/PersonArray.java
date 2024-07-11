import java.util.Scanner;

class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class PersonArray {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();
        scanner.nextLine();  // consume newline
        
        Person[] persons = new Person[numPersons];
        
        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter name for person " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter age for person " + (i + 1) + ": ");
            int age = scanner.nextInt();
            scanner.nextLine();  // consume newline
            
            persons[i] = new Person(name, age);
        }
        
        System.out.println("Details of all persons:");
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
