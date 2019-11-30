package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        Cat cat1 = new Cat("Ragdoll");
        Cat cat2 = new Cat("British Shorthair");
        Cat cat3 = new Cat("American Shorthair");
        Cat cat4 = new Cat("Sphynx");
        Cat cat5 = new Cat("Scottish Fold");
        Cat cat6 = new Cat("Persian");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);
        cats.add(cat6);
        System.out.print("Cats = ");
        for (int i = 0; i < cats.size(); i++) {
            System.out.print(cats.get(i).getBreed()+ ", ");
        }
    }
}

