package com.company;


public class Main {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
	    Main test = new Main();
	    test.doWork();
    }

    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
           @Override
           public void run() {
               for (int i = 0; i < 10000; i++)
                   counter++;
           }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++)
                    counter++;
            }
        });
        thread1.start();
        thread2.start();

        System.out.println(counter);
    }
}