package basicprograms.multithread;

public class TestPrintnums {

    // Class-level lock
    private static final Object classLock = new Object();

    public static void main(String[] args) {
        // Creating two threads to print numbers
        Thread thread1 = new Thread(() -> printNumbers());
        Thread thread2 = new Thread(() -> printNumbers());

        // Start both threads
        thread1.start();
        thread2.start();
    }

    public static void printNumbers() {
        synchronized (classLock) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);

                // Simulate some work or delay
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
