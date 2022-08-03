package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ConcurrentModifyTest {
    public static void main(String[] args) {
        test2();
    }
    public static void test2(){
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            nums.add(new Random().nextInt(10000));
        }
        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                Iterator<Integer> iterator = nums.iterator();
                while (iterator.hasNext()) {
                    Integer next = iterator.next();
                    if (next > 100){
                        iterator.remove();
                    }
                }
            }).start();
        }
    }
}
