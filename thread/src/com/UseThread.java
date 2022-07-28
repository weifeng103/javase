package com;

public class UseThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
        System.out.println("hello");
        System.out.println("-----------" + Math.random() + "-----------");
        ThreadUtils.sleep(100);

        }
    }

    public static void main(String[] args) {
        new UseThread().start();
    }
}
