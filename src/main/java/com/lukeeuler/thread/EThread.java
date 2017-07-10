package com.lukeeuler.thread;

public class EThread implements Runnable {
    @Override
    public void run() {
        throw new RuntimeException();
    }
}
