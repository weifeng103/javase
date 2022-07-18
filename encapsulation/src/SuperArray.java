import java.util.Arrays;

/**
 * ��������
 */
public class SuperArray {
    // �����ݵ���ɾ�Ĳ�
    // ����һ��Ԫ��,β��
    private int []element;
    private int currentIndex = -1;
    public SuperArray(){
        this(10);
    }
    public SuperArray(int capacity){
        element = new int[capacity];
    }
    public void add(int data) {
        currentIndex++;
        // �±�ֵӦ���±�ֵ�Ƚ�
        // length - 1 = �±�ֵ
        if (currentIndex > element.length - 1) {
           int []temp = new int[element.length * 2];
           System.arraycopy(element, 0, temp, 0, element.length);
           element = temp;
        }
        element[currentIndex] = data;
    }
    // ɾ��һ��Ԫ��
    public void delete(int index) {
        for (int i = index + 1; i < element.length; i++) {
            element[i - 1] = element[i];
        }
        int []temp = new int[element.length - 1];
        System.arraycopy(element, 0, temp, 0, element.length - 1);
        element = temp;
        if (index < element.length - 1 && index >= 0){
            currentIndex --;
        }else {
            System.out.println("��ɾ�����±�["+index+"]���ڷ�Χ��");
        }
    }
    // �޸�һ��Ԫ��
    public void set(int index,int data) {
        if (index > element.length - 1 || index < 0){
            System.out.println("���޸ĵ��±�["+index+"]���ڷ�Χ��");
        }else {
            element[index] = data;
        }
    }
    // ��ѯһ��Ԫ��
    // ��ô��ʾû�ҵ���
    public Integer find(int index) {
        if (index > element.length - 1 || index < 0){
            System.out.println("���ѯ���±�["+index+"]���ڷ�Χ��");
            return null;
        }else{
            return element[index];
        }
    }
    public int size(){
        return currentIndex + 1;
    }
    public String arrayToString(){
        String result = "[";
        for (int i = 0; i < currentIndex + 1; i++) {
            result += element[i] + ",";
        }
        result = result.substring(0,result.length() - 1) + "]";
        return result;
    }
    public void sort(){
        Arrays.sort(element);
    }
    public static void main(String[] args) {
        SuperArray superArray = new SuperArray(4);
        superArray.add(133);
        superArray.add(12);
        superArray.add(1200);
        superArray.delete(5);
        superArray.find(3);
        superArray.sort();
//        for (int i = 0; i < superArray.size(); i++) {
//            System.out.println(superArray.find(i));
//        }
        System.out.println(superArray.arrayToString());
    }
}


