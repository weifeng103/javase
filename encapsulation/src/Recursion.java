/**
 * 쳲���������ָ��������һ������ 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,
 * 89, 144, 233��377��610��987��1597��2584��4181��6765��
 * 10946��17711��28657��46368����
 * �ر�ָ������0����0����1���ǵ�һ��1��
 */
public class Recursion {

    public int fibonacci(int num){
        if (num ==0||num==1){
            return num;
        }else{
            return fibonacci(num - 1) + fibonacci(num - 2) ;
        }
    }
    public int factorial(int num){
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
    public int recursionFactorial(int num){
        if (num == 1){
            return 1;
        }else return num*recursionFactorial(num-1);
    }

    public static void main(String[] args) {
        Recursion recursion=new Recursion();
        int target = recursion.fibonacci(5);
        System.out.println(target);
        int factorial = recursion.factorial(4);
        System.out.println(factorial);
        int flag = recursion.recursionFactorial(4);
        System.out.println(flag);
    }
}
