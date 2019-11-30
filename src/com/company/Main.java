package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
        Dog dog1 = new Dog("Labrador Retriever");
        Dog dog2 = new Dog("German Shepherd");
        Dog dog3 = new Dog("Golden Retriever");
        Dog dog4 = new Dog("Bulldog");
        Dog dog5 = new Dog("Rottweiler");
        Dog dog6 = new Dog("Boxer");
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);
        dogs.add(dog5);
        dogs.add(dog6);
        System.out.print("dogs = ");
        for (int i = 0; i < dogs.size(); i++) {
            System.out.print(dogs.get(i).getBreed()+ ", ");
        }
    }
}

