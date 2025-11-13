package MultiThreading;

public class ThreadMethod2 extends Thread {

    public ThreadMethod2(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running...");
            Thread.yield(); //give the chance to another thread
        }
    }

    public static void main(String[] args) {
        ThreadMethod2 t1 = new ThreadMethod2("t1");
        ThreadMethod2 t2 = new ThreadMethod2("t2");
        t1.start();
        t2.start();
    }
}
