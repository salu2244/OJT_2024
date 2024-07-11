class Shape {
   void draw(){
    System.out.println("Drawing shape");

   } 
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawin a circle");

    }

}
class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawin a Rectangle");

    }

}
public class Main23{
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
       
        for(Shape shape : shapes) {
            shape.draw();  
        }
}
}

