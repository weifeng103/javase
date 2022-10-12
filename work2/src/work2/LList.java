package work2;


import java.util.Objects;

public class LList implements Manager {
    public final Node headNode = new Node();

    @Override
    public void insert(Object node) {
        Node temp = headNode;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = (Node) node;
    }

    @Override
    public void select(int id) {
        Node temp = headNode;
        while (!(temp.num == (Integer) id)) {
            temp = temp.next;
        }
        System.out.println(temp);
    }

    @Override
    public void update(int id, Object node) {
        Node temp = headNode;
        while (!Objects.equals(temp.num, id)) {
            temp = temp.next;
        }
        temp.num = ((Node) node).num;
    }

    @Override
    public void delete(int id) {
        Node temp = headNode;
        while (true) {
            if (temp.next.num == id) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
    }

    public void marge(Node node) {
        Node temp = headNode;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node.next;
    }

    public void orderMarge(Node node) {
        marge(node);
        Node cur = headNode.next;//当前节点设置为第一个节点
        Node tail = null;//最后一个节点
        while (cur.next != tail) {
            while (cur.next != tail) {
                if (cur.num > cur.next.num) {
                    int tmp = cur.num;
                    cur.num = cur.next.num;
                    cur.next.num = tmp;
                }
                cur = cur.next;
            }
            tail = cur;//下一次遍历的尾结点是当前结点
            cur = headNode.next;//遍历起始结点重置为头结点
        }
    }

    @Override
    public void show() {
        Node temp = headNode;
        while (temp.next != null) {
            temp = temp.next;
            System.out.println(temp);
        }
    }
}

