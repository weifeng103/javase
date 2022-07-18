package com;

public class Test2 {
    public <T> T show(T t) {
        System.out.println("inner " + t);
        return t;
    }
    public static void main(String[] args) {
        Test2 test = new Test2();
        test.show("hello");
    }
}
