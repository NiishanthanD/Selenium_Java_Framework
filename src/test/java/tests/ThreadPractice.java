package tests;

import org.testng.annotations.Test;

public class ThreadPractice {

    @Test
    public void threadExample() throws InterruptedException {

        Thread t1 = new Thread(() ->
                System.out.println("Thread 1 : " + Thread.currentThread().getId()));

        Thread t2 = new Thread(() ->
                System.out.println("Thread 2 : " + Thread.currentThread().getId()));

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}