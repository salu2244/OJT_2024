class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("Welcome to NSTI(W)");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread A was interrupted: " + e.getMessage());
            }
        }
    }
}

public class Read {
    public static void main(String[] args) {
        A t = new A();
        t.start(); // Start thread A
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("I love to study");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Main thread was interrupted: " + e.getMessage());
            }
        }
    }
}
