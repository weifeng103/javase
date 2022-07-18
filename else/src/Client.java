public class Client {
    public static void main(String[] args) {

        Function function = new Function(){
            @Override
            public Integer plus(Integer a, Integer b) {
                return a + b;
            }
        };

        Function function1 = (a,b) -> a + b;

        System.out.println("function.plus(1,2) = " + function.plus(1, 2));
        System.out.println("function1.plus(2,3) = " + function1.plus(2, 3));
    }
}
