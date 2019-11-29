package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Black");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Red");
        for (int i = 0; i < colors.size(); i++) {
            System.out.print(colors.get(i) + ", ");
        }
        Collections.reverse(colors);
        System.out.println("\n" + "Reserved array ");
        for (int i = 0; i < colors.size(); i++) {
            System.out.print(colors.get(i) + ", ");
        }
    }
}

