public class ThreadInterruptionExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                System.out.println("Thread started.");
                for (int i = 0; i < 10; i++) {
                    System.out.println("Working... " + i);
                    Thread.sleep(1000);  // Simulate some work
                }
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        });

        thread.start();

        try {
            Thread.sleep(3000); // Main thread sleeps for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt(); // Interrupt the thread
    }
}
