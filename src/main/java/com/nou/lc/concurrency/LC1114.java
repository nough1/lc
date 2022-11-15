package com.nou.lc.concurrency;

import java.util.concurrent.Semaphore;

/**
 * https://leetcode.com/problems/print-in-order/
 */
public class LC1114 {

    Semaphore second = new Semaphore(0);
    Semaphore third = new Semaphore(0);

    public LC1114() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        second.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        second.acquire();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        third.release();
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        third.acquire();
        printThird.run();
    }
}
