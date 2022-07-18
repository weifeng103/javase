package com;

public class Girl {
    public void feed(Pet pet){
        pet.coquetry();
    }

    public static void main(String[] args) {
        Girl girl = new Girl();
        Pet dog = new Dog();
        Pet cat = new Cat();
        girl.feed(dog);


    }
}
