package com.company;

public class Main {

    public static void main(String[] args) throws  InterruptedException {
	MyThread myThread = new MyThread();
	myThread.start();

	MyThread myThread2 = new MyThread();
	myThread2.start();
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {

            System.out.println("Hello from MyThread " + i);
        }
    }
}