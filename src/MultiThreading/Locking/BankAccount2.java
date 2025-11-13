package MultiThreading.Locking;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount2 {
    private int balance = 100;

    private final Lock lock = new ReentrantLock();

    //add synchronized only one thread can access called
    //
    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " proceeding withdrawl money " + amount);
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " completed withdrawl. Remaning Balance: " + balance);
                    } catch (Exception e) {

                    } finally {
                        lock.unlock();
                    }

                } else {
                    System.out.println(Thread.currentThread().getName() + " Insufficient Balance ");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " Could not acquire the lock. will try later.");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
