package lock;

public class Test1 {
    private static int COUNT = 0;
    public synchronized void adder(){
        COUNT++;
    }

    public static void main(String[] args) throws InterruptedException {
            for (int i = 0; i < 10000; i++) {
                Thread thread = new Thread(() -> {
                Test1 test = new Test1();
                test.adder();
                });
                thread.start();
                thread.join();
            }

            for (int i = 0; i < 10000; i++) {
                Thread thread = new Thread(() -> {
                    Test1 test = new Test1();
                    test.adder();
                });
                thread.start();
                thread.join();
            }

        System.out.println("最后的结果是："+COUNT);
    }
}
