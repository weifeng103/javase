package lock;

import com.ThreadUtils;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
    private static final Lock lock = new ReentrantLock();
    private static final Object MONITOR = new Object();
    public void say(){
        lock.lock();
        try {
        System.out.println("hello");
        System.out.println("-----------" + Math.random() + "-----------");
        ThreadUtils.sleep(100);
        }finally {
            lock.unlock();
        }

    }
    public static synchronized void say2(){
        System.out.println("world");
        System.out.println("-----------" + Math.random() + "-----------");
        ThreadUtils.sleep(100);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            new Thread(() -> {
                Test test = new Test();
                test.say();
            }).start();
        }
    }
}
