package MultiThreading;

public class ThreadDemon extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println("Hello World!");
        }
    }

    public static void main(String[] args) {
        ThreadDemon thread1 = new ThreadDemon();
        thread1.setDaemon(true);
        thread1.start();
        System.out.println("Main thread");
    }
}
