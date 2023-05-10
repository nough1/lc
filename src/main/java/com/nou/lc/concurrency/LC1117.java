package com.nou.lc.concurrency;

import java.util.concurrent.Semaphore;

/**
 * https://leetcode.com/problems/building-h2o/description/
 */
public class LC1117 {

    Semaphore h ;
    Semaphore o ;



    public LC1117() {

        h = new Semaphore(2,true);
        o = new Semaphore(0,true);

    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {

        h.acquire();
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        releaseHydrogen.run();
        o.release();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {

        o.acquire(2);
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
        releaseOxygen.run();

        h.release(2);
    }
}
