// Single-Level inheritance
// Class B ---> Class A, which means that class B is derived from Class A
 
class A {
    int a;
    void set_A(int x) { 
        a = x; 
    }
}
 
// Class B have access to all public and protected methods and data members of Class A
class B extends A {
    int b, product;
    void set_B(int x) { 
        b = x; 
    }
    void cal_Product() {
        product = a * b;
        System.out.println("Product = " + product);
    }
    
    public static void main(String[] args) {
        B b = new B();
        b.set_A(5);
        b.set_B(5);
        b.cal_Product();
    }
}
