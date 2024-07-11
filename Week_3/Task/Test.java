// Bicycle class
class Bicycle {
    // The Bicycle class has fields
    public int gear;
    public int speed;

    // The Bicycle class has one constructor
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    // The Bicycle class has two methods
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    // toString() method to print info of Bicycle
    @Override
    public String toString() {
        return "No of gears are " + gear + "\n" + "Speed of bicycle is " + speed;
    }
}

// Derived class
class MountainBike extends Bicycle {
    // MountainBike subclass adds one more field
    public int seatHeight;

    // The MountainBike subclass has one constructor
    public MountainBike(int gear, int speed, int startHeight) {
        super(gear, speed);
        this.seatHeight = startHeight;
    }

    // The MountainBike subclass adds one more method
    public void setSeatHeight(int newValue) {
        seatHeight = newValue;
    }

    // Overriding toString() method of Bicycle to print more info
    @Override
    public String toString() {
        return super.toString() + "\nSeat height is " + seatHeight;
    }
}

// Driver class
public class Test {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());
    }
}
