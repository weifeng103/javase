package lock;

public class LockTest {
    private static final Object MONITOR1 = new Object();
    private static final Object MONITOR2 = new Object();
    public static void main(String[] args) {
        new Thread(() -> {
          synchronized(MONITOR1){
              System.out.println(Thread.currentThread().getName() + "��ȡһ����");
          synchronized(MONITOR2){
                System.out.println(Thread.currentThread().getName() + "��ȡ������");
            }
          }
        },"thread1").start();

        new Thread(() -> {
          synchronized(MONITOR2){
              System.out.println(Thread.currentThread().getName() + "��ȡ������");
          synchronized(MONITOR1){
                System.out.println(Thread.currentThread().getName() + "��ȡһ����");
            }
          }
        },"thread2").start();
    }
}
