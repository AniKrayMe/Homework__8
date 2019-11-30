package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat1 = new Cat("Maine Coon");
        Cat cat2 = new Cat("British Shorthair");
        Cat cat3 = new Cat("Sphynx");
        Cat cat4 = new Cat("Scottish Fold");
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        animal.setCats(cats);
        System.out.print("Cats =  ");
        for (int i = 0; i < animal.getCats().size(); i++) {
            System.out.print(animal.getCats().get(i).getBreed() + ", ");
        }
        System.out.println();
        Dog dog1 = new Dog("German Shepherd");
        Dog dog2 = new Dog("Rottweiler");
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        animal.setDogs(dogs);
        System.out.print("Dogs =  ");
        for (int i = 0; i <animal.getDogs().size(); i++) {
            System.out.print( animal.getDogs().get(i).getBreed() + ", ");

        }
    }
}

