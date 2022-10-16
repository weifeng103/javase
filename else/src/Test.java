public class Test {
    public Test() {
        System.out.println("Test");
    }

    static {
        System.out.println("Hello World!");
    }

    {
        System.out.println("China NO.1!");
    }

    public static void main(String[] args) {
        int i;
        for (i = 0; i < 4; ++i) {
            System.out.println(i);
        }
        System.out.println(i);
    }

}
