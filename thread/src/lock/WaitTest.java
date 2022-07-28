package lock;

import com.ThreadUtils;

public class WaitTest {
    private static final Object MONITOR = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized(MONITOR){
                System.out.println("�߳�һ��ʼ��");
                try {
                    MONITOR.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("�߳�һ������");
            }
        }).start();
        new Thread(() -> {
            synchronized(MONITOR){
                System.out.println("�̶߳���ʼ��");
                ThreadUtils.sleep(2000);
                MONITOR.notify();
                System.out.println("�̶߳�������");
            }
        }).start();

    }
}
