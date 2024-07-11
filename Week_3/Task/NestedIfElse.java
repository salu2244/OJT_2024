public class NestedIfElse {
    public static void main(String[] args) {
        int x=30;
        int y= 10;


        if(x>20){
            System.out.println("The x is greater than 20");
            if(y>5)
            {
                System.out.println("y is greater than 5");
            }
            else{
                System.out.println("y is not greater than 5");

            }
        }
            else{
                System.out.println("x is not greater than 20");

            }
            
        }

    }

