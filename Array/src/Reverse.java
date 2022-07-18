import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            b[i] = a[a.length - 1 - i];
        }
        a = b;
        System.out.println(Arrays.toString(a));
    }

}
