package com.nou.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadTest {

    public static void main(String[] args) throws Throwable{

        Thread.sleep(1000);

        ThreadPoolExecutor executorPool = new ThreadPoolExecutor(5, 10, 3, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(50));

        new Semaphore(2,true
        );
    }
}
