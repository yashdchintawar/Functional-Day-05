package com.functional;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Value Of A");
        double a = in.nextDouble();

        System.out.println("Enter Value Of B");
        double b = in.nextDouble();

        System.out.println("Enter Value Of C");
        double c = in.nextDouble();

        double root1 = 0;
        double root2 = 0;

        double decrement = ((b * b) - 4 * a * c);
        System.out.println(decrement);

        if (decrement < 0) {
            System.out.println("Roots Are Imaginary");
        } else if (decrement == 0) {
            root1 = -b / 2 * a;
            root2 = -b / 2 * a;
            System.out.println("Root 01 Is: " + root1);
            System.out.println("Root 02 Is " + root2);
        } else if (decrement > 0) {
            root1 = -b + Math.sqrt(decrement / (2 * a));
            root1 = -b - Math.sqrt(decrement / (2 * a));
            System.out.println("Root 01 Is: " + root1);
            System.out.println("Root 02 Is " + root2);
        }

    }
}
