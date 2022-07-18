/**
 * 可以一直选择功能，1添加工号 2查找工号 3打印所有工号 4退出
 */

import java.util.Scanner;

public class HR {
    public static void main(String[] args) {
        int []a=new int[2];
        int currentIndex = 0;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("请选择功能：1添加工号 2查找工号 3打印所有工号 4退出");
            int select=scanner.nextInt();
            switch (select) {
                case 1:
                    System.out.println("请输入你要添加的工号");
                    int num=scanner.nextInt();
                    //判断是否需要扩容
                    if (currentIndex>a.length){
                        int []b=new int[a.length*2];
                        System.arraycopy(a, 0, b, 0, a.length);
                        a=b;
                    }
                    a[currentIndex]=num;
                    currentIndex++;
                    break;
                case 2:
                    System.out.println("请输入要查找的工号");
                    num = scanner.nextInt();
                    int result=-1;
                    for (int i = 0; i < a.length; i++) {
                        if (a[i] == num) {
                            result=i;
                        }
                    }
                    System.out.println(result==-1?"该工号不存在":"该工号存在"+a[result]);
                    break;
                case 3:
//                    System.out.println(Arrays.toString(a));
                    for (int i = 0; i < currentIndex; i++) {
                        System.out.print(a[i]+"\t");
                    }
                    System.out.println();
                    break;
                case 4:System.exit(0);
                    break;
            }
        }
    }
}
