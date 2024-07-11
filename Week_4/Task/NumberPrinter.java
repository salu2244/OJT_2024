class NumberPrinter extends Thread {
    private int startNum;

    public NumberPrinter(int startNum) {
        this.startNum = startNum;
    }

    public void run() {
        for (int i = startNum; i <= startNum + 4; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500); // Adding a small delay for readability
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class TwoThreadNumberPrint {
    public static void main(String[] args) {
        NumberPrinter thread1 = new NumberPrinter(1);
        NumberPrinter thread2 = new NumberPrinter(6);

        thread1.start();
        thread2.start();
    }
}
