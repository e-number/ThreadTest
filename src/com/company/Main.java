package com.company;


import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Future<Integer> future = executorService.submit(()-> {
            System.out.println("Starting");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finished");

            Random random = new Random();
            int randomValue = random.nextInt();

            if(randomValue < 5)
                throw new Exception("Something bad happened");

            return random.nextInt(10);
        });

        executorService.shutdown();

        int result = 0;
        try {
            result = future.get();
            System.out.println(result);
        } catch (ExecutionException e) {
            Throwable ex = e.getCause();
            System.out.println(ex.getMessage());
        }
    }
}