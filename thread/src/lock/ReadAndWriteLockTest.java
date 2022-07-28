package lock;

import com.ThreadUtils;

import java.util.Random;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadAndWriteLockTest {
        public static ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        public static int count = 1;

        public static void main(String[] args) {
            //读
            Runnable read = () -> {
                ReentrantReadWriteLock.ReadLock readLock = lock.readLock();
                readLock.lock();
                try{
                    ThreadUtils.sleep(2000);
                    System.out.println("我在读数据：" + count);
                }finally {
                    readLock.unlock();
                }
            };

            //写
            Runnable write = () -> {
                ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();
                writeLock.lock();
                try{
                    ThreadUtils.sleep(2000);
                    System.out.println("我在写数据：" + count++);
                }finally {
                    writeLock.unlock();
                }
            };

            for (int i = 0; i < 100; i++) {
                Random random = new Random();
                int flag = random.nextInt(100);
                if(flag > 20){
                    new Thread(read,"read").start();
                }else{
                    new Thread(write,"write").start();
                }
            }
        }
    }


