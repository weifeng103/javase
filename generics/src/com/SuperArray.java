package com;

/**
 * ��������
 */
public class SuperArray<T> {
    // �����ݵ���ɾ�Ĳ�
    // ����һ��Ԫ��,β��
    private Object[]element;
    private int currentIndex = -1;
    public SuperArray(){
        this(10);
    }
    public SuperArray(int capacity){
        element = new Object[capacity];
    }
    public void add(T data) {
        currentIndex++;
        // �±�ֵӦ���±�ֵ�Ƚ�
        // length - 1 = �±�ֵ
        if (currentIndex > element.length - 1) {
           Object []temp = new Object[element.length * 2];
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
        Object []temp = new Object[element.length - 1];
        System.arraycopy(element, 0, temp, 0, element.length - 1);
        element = temp;
        if (index < element.length - 1 && index >= 0){
            currentIndex --;
        }else {
            System.out.println("��ɾ�����±�["+index+"]���ڷ�Χ��");
        }
    }
    // �޸�һ��Ԫ��
    public void set(int index,T data) {
        if (index > element.length - 1 || index < 0){
            System.out.println("���޸ĵ��±�["+index+"]���ڷ�Χ��");
        }else {
            element[index] = data;
        }
    }
    // ��ѯһ��Ԫ��
    // ��ô��ʾû�ҵ���
    public T find(int index) {
        if (index > element.length - 1 || index < 0){
            System.out.println("���ѯ���±�["+index+"]���ڷ�Χ��");
            return null;
        }else{
            return (T)element[index];
        }
    }
    public int size(){
        return currentIndex + 1;
    }
    public String arrayToString(){
        String result = "[";
        for (int i = 0; i < currentIndex + 1; i++) {
            result += element[i].toString() + ",";
        }
        result = result.substring(0,result.length() - 1) + "]";
        return result;
    }
}


