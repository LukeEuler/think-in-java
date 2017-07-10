package com.lukeeuler.thread;

public class ETCaught implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.printf("caught " + e);
    }
}
