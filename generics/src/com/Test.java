package com;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("����", 18);
        Student student2 = new Student("����", 19);
        Student student3 = new Student("����", 20);

        SuperArray<Student> superArray = new SuperArray<>();
        superArray.add(student);
        superArray.add(student2);
        superArray.add(student3);
        for (int i = 0; i < superArray.size(); i++) {
            superArray.find(i).play();
        }
        System.out.println(superArray.arrayToString());
        
    }
}
