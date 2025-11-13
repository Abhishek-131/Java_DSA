package MultiThreading;

public class ThreadMethod extends Thread {

    public ThreadMethod(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - count " + i);

            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println("Thread Interrupted : " + e);
            }
        }
    }

    public static void main(String[] args) {
        ThreadMethod l = new ThreadMethod("Low Priority");
        ThreadMethod m = new ThreadMethod("Medium Priority");
        ThreadMethod h = new ThreadMethod("High Priority");

        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);

        l.start();
        m.start();
        h.start();

    }
}
