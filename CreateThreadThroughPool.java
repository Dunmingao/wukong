package com.example.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CreateThreadThroughPool {
    public static void main(String[] args) {
        ExecutorService executors = Executors.newCachedThreadPool();
        for(int i = 0; i < 1000 ; i++){
            executors.submit(new Task());
        }
    }
}
class Task implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());

    }
}
