package com;

public class StudentComparator implements Comparator<Student> {
    @Override
    public double compare(Student userOne, Student userTwo) {
        return userOne.getAge() - userTwo.getAge();
    }
}
