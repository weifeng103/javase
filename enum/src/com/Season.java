package com;

public class Season {
    private int value;
    private String name;

    // 定义四个静态常量让每个季节在内存中独此一份
    public static final Season SPRING = new Season(1,"春天");
    public static final Season SUMMER = new Season(2,"夏天");
    public static final Season AUTUMN = new Season(3,"秋天");
    public static final Season WINTER = new Season(4,"冬天");

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
