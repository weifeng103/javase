package lock;

public class YieldTest {
    private static  int COUNT1 = 0;
    private static  int COUNT2 = 1;
    public static void add(){
        System.out.println(Thread.currentThread().getName()+":"+COUNT1++);
    }
    public static void add2(){
        System.out.println(Thread.currentThread().getName()+":"+COUNT2++);
    }

    public static void main(String[] args) {
        new Thread(() -> {
        for (int i = 0; i < 1000; i++) {
            Thread.yield();
            add();
        }
        },"t1").start();
        new Thread(() -> {
        for (int i = 0; i < 1000; i++) {
            add2();
        }
        },"t2").start();
    }
}
