public class QueueThread extends Thread {
    private volatile int countSeconds = 0;
    private volatile boolean running = true;

    public void run() {
//        System.out.println("Runnable running: " + Thread.currentThread().getName());
        try {
            while (running) {
//                System.out.println("Count: " + countSeconds);
                Thread.sleep(1000); // Pause for 1 second
                countSeconds++;
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted.");
        }
    }

    public int getCountSeconds() {
        return countSeconds;
    }

    public void stopRunning() {
        running = false;
    }

}
