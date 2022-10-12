package work2;

public class LinkedListTest {
    public static void main(String[] args) {
        LList list = new LList();
        LList list2 = new LList();
        Node node = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        list.insert(node2);
        list.insert(node);
        list2.insert(node4);
        list2.insert(node3);
        list.orderMarge(list2.headNode);
        list.show();
        System.out.println("----------------");
        list.update(1,node5);
        list.show();
        System.out.println("----------------");
        list.select(5);
    }
}
