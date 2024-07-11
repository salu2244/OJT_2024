//Base class
class Animal{
    void eat(){
        System.out.println("eat() method of base class");
        System.out.println("eating.");

    }
}
// Inherited Class
class Dog extends Animal {
    void eat(){
        System.out.println("eat() method of derived class");
        System.out.println("Dog is eating.");

    }
}
// Driver Class
class MrthodOverridingEx {
    // main function
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Animal a1 = new Animal();

        d1.eat();
        a1.eat();

        // polymorphosm Animal reference pointing to Dog object
        Animal animal = new Dog();

        // calls the eat() method of Dog class
        animal.eat();


    }
}

