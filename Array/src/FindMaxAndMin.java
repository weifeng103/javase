public class FindMaxAndMin {
    public static void main(String[] args) {
        int []a=new int[]{-3,-1,0,1,2,200,3,4,5};
        int maxIndex =0;
        int minIndex =0;
        for (int i=1; i<a.length; i++){
            if (a[i]>a[maxIndex]){
                maxIndex =i;
            }
        }for (int i=1; i<a.length; i++){
            if (a[i]<a[minIndex]){
                minIndex =i;
            }
        }
        System.out.println(a[maxIndex]);
        System.out.println(a[minIndex]);
    }
}
