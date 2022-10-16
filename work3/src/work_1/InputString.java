package work_1;

import java.util.Scanner;

public class InputString {
    static {
        System.out.println("请输入字符串");
    }
    static Scanner scanner = new Scanner(System.in);
    static String in = scanner.nextLine();
    static char[] chars = in.toCharArray();
    static Node head = null;
    static Stack stack = new Stack();

    public static void toLinkedList() {
        Node temp = null;
        for (int i = 0; i < chars.length; i++) {
            Node node = new Node(chars[i]);
            if (i == 0) {
                head = node;
                temp = head;
            } else {
                temp.next = node;
                temp = node;
            }
        }
    }

    public static void toLinkedStack() {
        for (char aChar : chars) {
            stack.push(new Node(aChar));
        }
    }

    public static boolean judgeHuiWen() {
        InputString.toLinkedList();
        InputString.toLinkedStack();
        Node headTemp = head;
        for (int i = 0; i < ((chars.length) / 2); i++) {
            if (headTemp.data == stack.top.data) {
                headTemp = headTemp.next;
                stack.pop();
            } else {
                return false;
            }
        }
        return true;
    }

    public static void isHuiWen() {
        if (InputString.judgeHuiWen()) {
            System.out.println("输入的是回文");
        } else {
            System.out.println("输入不是回文");
        }
    }
}
