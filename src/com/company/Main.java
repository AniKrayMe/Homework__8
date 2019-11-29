package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please print index ");
        int index = scanner.nextInt();
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Black");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Red");
        colors.remove(index);
        for (int i = 0; i < colors.size(); i++) {
            System.out.print(colors.get(i) + ", ");
        }
    }
}

