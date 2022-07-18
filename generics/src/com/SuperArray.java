package com;

/**
 * 超级数组
 */
public class SuperArray<T> {
    // 对数据的增删改查
    // 增加一个元素,尾插
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
        // 下标值应与下标值比较
        // length - 1 = 下标值
        if (currentIndex > element.length - 1) {
           Object []temp = new Object[element.length * 2];
           System.arraycopy(element, 0, temp, 0, element.length);
           element = temp;
        }
        element[currentIndex] = data;
    }
    // 删除一个元素
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
            System.out.println("你删除的下标["+index+"]不在范围内");
        }
    }
    // 修改一个元素
    public void set(int index,T data) {
        if (index > element.length - 1 || index < 0){
            System.out.println("你修改的下标["+index+"]不在范围内");
        }else {
            element[index] = data;
        }
    }
    // 查询一个元素
    // 怎么表示没找到？
    public T find(int index) {
        if (index > element.length - 1 || index < 0){
            System.out.println("你查询的下标["+index+"]不在范围内");
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


