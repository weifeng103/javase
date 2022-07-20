package com;

public class Season {
    private int value;
    private String name;

    // �����ĸ���̬������ÿ���������ڴ��ж���һ��
    public static final Season SPRING = new Season(1,"����");
    public static final Season SUMMER = new Season(2,"����");
    public static final Season AUTUMN = new Season(3,"����");
    public static final Season WINTER = new Season(4,"����");

    private Season(){}

    private Season(int value, String name) {
        this.value = value;
        this.name = name;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
