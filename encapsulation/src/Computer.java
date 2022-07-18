public class Computer {
    public int plus(int...num){
        int result = 0;
        for (int i = 0; i < num.length; i++) {
            result += num[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println(computer.plus(1,23,2,412,4));
    }
}
