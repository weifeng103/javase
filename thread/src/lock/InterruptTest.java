package lock;

import com.ThreadUtils;

public class InterruptTest {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            synchronized(InterruptTest.class){
            System.out.println("begin");
            System.out.println("end");
            }
        });
        thread.start();
        try {
            thread.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ThreadUtils.sleep(2000);
        thread.interrupt();
    }
}
