package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Collections.addAll(nums,1,23,4,3,5,56);
        Collections.shuffle(nums);
        System.out.println(nums);
    }
}
