public class Encapsulate {
    private String geekName;
    private int geekRoll;
    private int geekAge;

    // Getter method for age
    public int getAge() {
        return geekAge;
    }

    // Getter method for name
    public String getName() {
        return geekName;
    }

    // Getter method for roll
    public int getRoll() {
        return geekRoll;
    }

    // Setter method for age
    public void setAge(int newAge) {
        geekAge = newAge;
    }

    // Setter method for name
    public void setName(String newName) {
        geekName = newName;
    }

    // Setter method for roll
    public void setRoll(int newRoll) {
        geekRoll = newRoll;
    }
}

// Class to access variables of the class Encapsulate
public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();

        // Setting values of the variables
        obj.setName("Shikha");
        obj.setAge(19);
        obj.setRoll(51);

        // Displaying values of the variables
        System.out.println("Geek's name: " + obj.getName());
        System.out.println("Geek's age: " + obj.getAge());
        System.out.println("Geek's roll: " + obj.getRoll());

        // Direct access of geekName is not possible due to encapsulation
        // System.out.println("Geek's name: " + obj.geekName); // This line will cause an error
    }
}
