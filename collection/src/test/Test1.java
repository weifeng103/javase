package test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("c");
        list2.add("d");

        list.addAll(0,list2);
        list.remove(0);
        list.set(0,"a");
        System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }


    }
}
