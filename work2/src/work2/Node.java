package work2;

public class Node {
    public Integer num;
    public Node next;

    public Node() {
    }

    public Node(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Node [num=" + num + "]";
    }
}
