class LivingBeing{
    void breathe(){
        System.out.println("Living being breathe");

    }
}
class Animal extends LivingBeing{
    void move(){
        System.out.println("Dog Barks");

    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog Barks");

    }
}
public  class Main8 {

    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.breathe();
        dog.move();
        dog.bark();

    }
}