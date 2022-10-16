package work_2;

public class Node {
    int y;
    int x;
    Node next;

    public Node() {
    }

    public Node(int y, int x) {
        this.y = y;
        this.x = x;
    }

    @Override
    public String toString() {
        return "(" +
                (y-1) +
                ", " + (x-1) +
                ")";
    }
}
