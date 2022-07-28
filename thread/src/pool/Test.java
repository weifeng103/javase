package pool;

import com.ThreadUtils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Runnable task = () -> {
            ThreadUtils.sleep(2000);
            System.out.println("-----------------");
        };
        for (int i = 0; i < 100; i++) {
        executorService.submit(task);
        }
    }
}
