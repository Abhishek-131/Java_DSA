package MultiThreading;

public class MyThreadState extends Thread {
    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);  //sleep
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThreadState t1 = new MyThreadState(); //NEW
        System.out.println(t1.getState());

        t1.start(); //RUNNABLE
        System.out.println(t1.getState());

        Thread.sleep(1000);
        System.out.println(t1.getState());

        t1.join();//TERMINATED
        System.out.println(t1.getState());

    }
}
