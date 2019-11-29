package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Black");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Red");
        System.out.print("colors = ");
        for (int i = 0; i < colors.size(); i++) {
            System.out.print(colors.get(i) + ", ");
        }
        System.out.println();
        ArrayList<String> colors2 = new ArrayList<>();
        colors2.add("Silver");
        colors2.add("Fuchsia");
        colors2.add("Pink");
        colors2.add("Lime");
        colors2.add("Aqua");
        System.out.print("colors2 = ");
        for (int i = 0; i < colors2.size(); i++) {
            System.out.print(colors2.get(i) + ", ");
        }
        System.out.println();
        ArrayList<String> joined = new ArrayList<>();
        joined.addAll(colors);
        joined.addAll(colors2);
        System.out.print("joined = ");
        for (int i = 0; i <joined.size(); i++) {
            System.out.print(joined.get(i) + ", ");
        }
        System.out.println();
        System.out.println("Print Clear.array if you want delete array ");
        Scanner scanner = new Scanner(System.in);
        String array =scanner.next();
        switch (array){
            case "Clear.color":
                colors.clear();
                System.out.print("array list color emptied ");
                break;

            case "Clear.color2":
                colors2.clear();
                System.out.print("array list color2 emptied ");
                break;

            case "Clear.joined":
                joined.clear();
                System.out.print("array list joined emptied ");
                break;
            default:
                System.out.println("Incorrect 'Clear.array' ");
        }

    }
}

