class EncapsulatedClass{
    private String data;

    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data= data;
    }

}

public class Main9 {
    public static void main(String[] args) {
        EncapsulatedClass obj= new EncapsulatedClass();
        obj.setData("Hello");
        System.out.println(obj.getData());
    }
    
}
