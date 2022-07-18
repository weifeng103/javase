import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int []a=new int[]{2,1,3,5,4,6,7};
        Arrays.sort(a);
        int index= Arrays.binarySearch(a,4);
        System.out.println(index);
    }
}
