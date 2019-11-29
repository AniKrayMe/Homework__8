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
        ArrayList<String> colors2 = new ArrayList<>();
        colors2 = colors;
        for (int i = 0; i < colors2.size(); i++) {
            System.out.print(colors2.get(i) + ", ");
        }
    }
}

