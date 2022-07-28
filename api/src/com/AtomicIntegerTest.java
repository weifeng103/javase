package com;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {
    private static final AtomicInteger atomicInteger = new AtomicInteger();

    public static void main(String[] args) {
        for (int i = 0; i < 200; i++) {
            new Thread(() -> {
                ThreadUtils.sleep(200);
                atomicInteger.getAndIncrement();
            }).start();
        }
        ThreadUtils.sleep(3000);
        System.out.println(atomicInteger.get());
    }
}
