class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("NSTI");
        }
    }
}

public class B {
    public static void main(String[] args) {
        A t = new A();
        t.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("ITS AWSM IN STUDYING NSTI");
        }
    }
}
