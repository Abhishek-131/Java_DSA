package MultiThreading;

public class Test {
    public static void main(String[] args) {

        World world = new World(); //New State
        //Extend Thread Class
        Thread t1 = new Thread(world);
        t1.start();

        for (; ; ) {
            //find the current name of the thread
            System.out.println(Thread.currentThread().getName());

            //find the current state of the tread
            // System.out.println(Thread.currentThread().getState());
        }

    }

}
