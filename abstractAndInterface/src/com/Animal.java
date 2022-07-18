package com;

public abstract class Animal {
    private String name;
    public Animal(){
        this.name = "lili";
    }
    abstract void eat();

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
    }
}


