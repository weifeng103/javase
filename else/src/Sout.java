public class Sout {
    public void print(){

    };

    public static void main(String[] args) {
        Sout sout = new Sout() {
            @Override
            public void print() {
                System.out.println("���������ڲ���");
            }
        };
        sout.print();
    }
}

