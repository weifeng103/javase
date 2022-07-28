package lock;

import com.ThreadUtils;

public class WaitTest {
    private static final Object MONITOR = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized(MONITOR){
                System.out.println("线程一开始了");
                try {
                    MONITOR.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("线程一结束了");
            }
        }).start();
        new Thread(() -> {
            synchronized(MONITOR){
                System.out.println("线程二开始了");
                ThreadUtils.sleep(2000);
                MONITOR.notify();
                System.out.println("线程二结束了");
            }
        }).start();

    }
}
