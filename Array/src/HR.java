/**
 * ����һֱѡ���ܣ�1��ӹ��� 2���ҹ��� 3��ӡ���й��� 4�˳�
 */

import java.util.Scanner;

public class HR {
    public static void main(String[] args) {
        int []a=new int[2];
        int currentIndex = 0;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("��ѡ���ܣ�1��ӹ��� 2���ҹ��� 3��ӡ���й��� 4�˳�");
            int select=scanner.nextInt();
            switch (select) {
                case 1:
                    System.out.println("��������Ҫ��ӵĹ���");
                    int num=scanner.nextInt();
                    //�ж��Ƿ���Ҫ����
                    if (currentIndex>a.length){
                        int []b=new int[a.length*2];
                        System.arraycopy(a, 0, b, 0, a.length);
                        a=b;
                    }
                    a[currentIndex]=num;
                    currentIndex++;
                    break;
                case 2:
                    System.out.println("������Ҫ���ҵĹ���");
                    num = scanner.nextInt();
                    int result=-1;
                    for (int i = 0; i < a.length; i++) {
                        if (a[i] == num) {
                            result=i;
                        }
                    }
                    System.out.println(result==-1?"�ù��Ų�����":"�ù��Ŵ���"+a[result]);
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
