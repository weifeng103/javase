public class Test2 {
    public static String name1 = "ydl";
    public String name2 = "ydl";

    public static void print() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        System.out.println(Test2.name1);
        Test2.print();
        new Test2();
    }
}


