package work_1;


public class Stack {
    Node base;
    Node top;

    public void init() {
        Node elem = new Node();
        base = elem;
        top = elem;
    }

    public void push(Node node) {
        Node temp = new Node();
        temp.data = node.data;
        temp.next = top;
        top = temp;

    }

    public boolean isEmpty() {
        return base == top;
    }

    public Node peek() {
        return top;
    }

    public Node pop() {
        Node temp = new Node();
        temp = top;
        top = top.next;
        return temp;
    }
}
