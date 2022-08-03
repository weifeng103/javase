package test;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<String,User> map = new LinkedHashMap<>();
        map.put("010101",new User("����1",12));
        map.put("010101",new User("����2",12));
        map.put("010102",new User("����3",12));
        map.put("010103",new User("����4",12));
        // ��һ�ַ�ʽ
        Iterator<String> iterator = map.keySet().iterator();
        while(iterator.hasNext()) {
            String key = iterator.next();
            System.out.println("key = " + key);
            System.out.println("value = " + map.get(key));
        }
        System.out.println("------------");
        // �ڶ���
        Set<Map.Entry<String, User>> entries = map.entrySet();
        Iterator<Map.Entry<String, User>> iterator1 = entries.iterator();
        while (iterator1.hasNext()){
            Map.Entry<String, User> entry = iterator1.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
