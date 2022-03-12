package com.functional;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x1=0;
        int y1=0;

        System.out.println("Enter X Point:- ");
        int x2 = in.nextInt();

        System.out.println("Enter Y Point:- ");
        int y2 = in.nextInt();

        int distance = (int) Math.sqrt(x2*x2 + y2*y2);
        System.out.println(distance);

    }
}
