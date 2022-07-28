package com;

public class Singleton {
    private  Singleton() {
    }
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE.singleton;
    }
    private enum SingletonHolder {
        INSTANCE;
        private Singleton singleton;
        SingletonHolder(){
            this.singleton = new Singleton();
        }

    }
}
