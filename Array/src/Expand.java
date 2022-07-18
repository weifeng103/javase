import java.util.Arrays;

public class Expand {
    public static void main(String[] args) {
        int []a=new int[]{1,2,3,4};
        int []b=new int[a.length*2];
        for (int i=0; i<a.length; i++){
            b[i]=a[i];
        }
        a=b;
            System.out.println(Arrays.toString(a));
    }
}
