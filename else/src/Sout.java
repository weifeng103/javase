public class Sout {
    public void print(){

    };

    public static void main(String[] args) {
        Sout sout = new Sout() {
            @Override
            public void print() {
                System.out.println("这是匿名内部类");
            }
        };
        sout.print();
    }
}

