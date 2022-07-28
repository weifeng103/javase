package lock;

public class LockTest {
    private static final Object MONITOR1 = new Object();
    private static final Object MONITOR2 = new Object();
    public static void main(String[] args) {
        new Thread(() -> {
          synchronized(MONITOR1){
              System.out.println(Thread.currentThread().getName() + "获取一号锁");
          synchronized(MONITOR2){
                System.out.println(Thread.currentThread().getName() + "获取二号锁");
            }
          }
        },"thread1").start();

        new Thread(() -> {
          synchronized(MONITOR2){
              System.out.println(Thread.currentThread().getName() + "获取二号锁");
          synchronized(MONITOR1){
                System.out.println(Thread.currentThread().getName() + "获取一号锁");
            }
          }
        },"thread2").start();
    }
}
