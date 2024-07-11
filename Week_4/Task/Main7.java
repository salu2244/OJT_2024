class Vehical{
    void displayType(){
        System.out.println("This is a Vehicle");

    }
}
class Car extends Vehical{
    void displayBrand(){
        System.out.println("This car is a Tesla");

    }

}

public class Main7 {
    public static void main(String[] args) {
        Car car=new Car();
        car.displayType();
        car.displayBrand();


    }
    
}
