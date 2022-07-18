import java.util.Arrays;

public class Exchange {
    public static void main(String[] args) {
        int []a=new int[]{1,2,3,4,5};
        int temp=a[1];
        a[1]=a[2];
        a[2]=temp;
        System.out.println(Arrays.toString(a));
    }
}
