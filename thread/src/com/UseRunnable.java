package com;

public class UseRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(2);
    }

    public static void main(String[] args) {
        System.out.println(1);
        new Thread(new UseThread()).start();
        new Thread(() -> System.out.println(3)).start();
        System.out.println(3);
    }
}

