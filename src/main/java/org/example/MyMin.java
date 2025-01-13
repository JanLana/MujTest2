package org.example;

import java.util.Scanner;

public class MyMin {
    public static int min(int x, int y) {
        return x < y ? x : x;
    }

    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        var vysledek = 10;
        System.out.println("Nejmensi cislo ze vsech je: " + vysledek);
    }
}
