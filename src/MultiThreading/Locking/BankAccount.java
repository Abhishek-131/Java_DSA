package MultiThreading.Locking;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;


    //add synchronized only one thread can access called
    //
    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " proceeding to withdrawal ");
            try {
                Thread.sleep(10000); // take 10s time to perform task
            } catch (InterruptedException e) {

            }
            balance -= amount;
        } else {
            System.out.println(Thread.currentThread().getName() + " insufficient balance ");
        }
    }


}
