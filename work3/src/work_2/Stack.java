package work_2;

public class Stack {
    Node base;
    Node top ;
    public void init(){
        Node elem = new Node() ;
        base = elem ;
        top =  elem ;
    }
    public void push(Node node){
        Node temp = new Node();
        temp.x = node.x;
        temp.y = node.y;
        temp.next = top;
        top = temp;
    }
    public boolean isEmpty(){
        return base == top;
    }
    public Node peek(){
        return top;
    }
    public Node pop() {
        if (this.isEmpty()) {
            System.out.println("退栈失败，栈为空！");
            return null;
        }
        Node temp = new Node();
        temp = top;
        top = top.next;
        return temp;
    }
}
