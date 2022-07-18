public class SuperLink {
    private Node head;
    private int currentIndex = -1;

    // 增加一个元素,头插
    public void add(int data) {
        if (head == null) {
            head = new Node(data,null);
        }else{
            Node node = new Node(data,head);
            head = node;
        }
        currentIndex++;
    }
    public void add(int index,int data){
        if (index == 0){
            add(data);
        }else {
            // 找到下标为index-1的节点
            Node node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.getNext();
            }
            Node newNode = new Node(data, node.getNext());
            node.setNext(newNode);

            currentIndex++;
        }
    }
    // 删除一个元素
    public void delete(int index) {
        Node node = head;
        if (index == 0){
            head = head.getNext();
        }else{
            for (int i = 0; i < index - 1; i++) {
                node = node.getNext();
            }
            node.setNext(node.getNext().getNext());}
        currentIndex--;
    }
    // 修改一个元素
    public void set(int index,int data) {
        Node node = head;
        for (int i = 0; i < index ; i++) {
            node = node.getNext();
        }
        node.setData(data);
    }
    // 查询一个元素
    // 怎么表示没找到？
    public Integer find(int index) {
        Node node = head;
        for (int i = 0; i < index ; i++) {
            node = node.getNext();
        }
        return node.getData();
    }

    public static void main(String[] args) {
        SuperLink superLink = new SuperLink();
        superLink.add(1);
        superLink.add(2);
        superLink.add(3);
        superLink.delete(0);
    }
}
