class Car{
    String color;
    String model;
    void display(){
        System.out.println("Model:"+model+",color:"+color);

    }
}
public class Main4{
    public static void main(String[] args) {
        Car car=new Car();
        car.color="red";
        car.model="Toyoto";
        car.display();
    }
}