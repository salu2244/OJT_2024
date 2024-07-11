class Vehicle{
    void type(){
        System.out.println("The car brand name is Maruti Suzuki");
    }
}class brand extends Vehicle{
    void brand(){
        System.out.println("The cars Brand is Thar");
    }
}



public class Main6 {
    public static void main(String[] args) {
        brand carbrand=new brand();
        carbrand.type();
        carbrand.brand();

    }
}
    

