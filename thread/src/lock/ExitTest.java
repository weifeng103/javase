package lock;

import com.ThreadUtils;

public class ExitTest {
    private volatile static boolean flag = true;
    public static void main(String[] args) {
        new Thread(() -> {
            while (flag){
                System.out.println("t1");
            }
        }).start();
        ThreadUtils.sleep(2000);
        flag = false;
    }
}
