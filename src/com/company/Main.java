package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Black");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Red");
        colors.remove(2);
        for (int i = 0; i < colors.size(); i++) {
            System.out.print(colors.get(i) + ", ");
        }
    }
}

