package work_1;

public class Node {
    char data;
    Node next;

    public Node() {
    }

    public Node(char t){
        this.data=t;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
