class MyAnotherThread extends Thread {
    public void run() {
        // Task for another thread
        for (int i = 10; i >= 1; i--) {
            System.out.println("Another thread = " + i);
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}