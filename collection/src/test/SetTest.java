package test;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
    public static void main(String[] args) {
        // ���ظ���ɾ��
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("e");
        hashSet.add("e");
        hashSet.add("z");
        hashSet.add("m");
        hashSet.add("n");
        hashSet.add("h");
        hashSet.add("r");
        Iterator<String> iterator = hashSet.iterator();
        // ��������û����һ��
        while(iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
