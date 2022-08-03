package demo;

public class RecursiveBinaryTree {

    private static class Node{
        Integer date;
        Node left;
        Node right;

        public Node(Integer date) {
            this.date = date;
        }
    }

    private static void recursive(Node node){
        if (node == null){
            return;
        }
        recursive(node.left);
        recursive(node.right);

    }
    private static void preOrder(Node node){
        if (node == null){
            return;
        }
        System.out.println(node.date);
        preOrder(node.left);
        postOrder(node.right);
    }
    private static void inOrder(Node node){
        if (node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.date);
        inOrder(node.right);
    }
    private static void postOrder(Node node){
        if (node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.date);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        preOrder(root);
        System.out.println("-----------");
        inOrder(root);
    }
}
