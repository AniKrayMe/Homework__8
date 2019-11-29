package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(135);
        numbers.add(222);
        numbers.add(456);
        numbers.add(22);
        numbers.add(10);
        numbers.add(85);
        numbers.add(355);
        System.out.print("numbers = ");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + ", ");
        }
        System.out.println();
        System.out.print("Without even numbers = ");
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                System.out.print(numbers.get(i) + ", ");
            }
        }
    }
}

