package com.basic;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number To Check Number Is Odd Or Even");
        int num = in.nextInt();
        evenOrOdd(num);
    }

    public static void evenOrOdd(int num) {

        if (num % 2 == 0) {
            System.out.println(num + " Is Even Number");
        }
        else {
            System.out.println(num+ " Is Odd Number");
        }
    }
}
