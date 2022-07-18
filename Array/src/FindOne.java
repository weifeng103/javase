import java.util.Scanner;

public class FindOne {
    public static void main(String[] args) {
        int[] a =new int[]{1,2,3,4,5};
        Scanner scanner = new Scanner(System.in);
        int target=scanner.nextInt();
        int result=-1;
        for (int i=0; i<a.length; i++){
            if (a[i]==target){
                result=target;
                break;
            }
        }
        System.out.println(result);
    }
}
