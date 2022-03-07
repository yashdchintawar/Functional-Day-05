package com.basic;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the N Number: ");
    int num = in.nextInt();
    int powerOfTwoTillNum = powerOfTwo(num);

    System.out.println("power of 2 Is: " +powerOfTwoTillNum);
    }

    public static int powerOfTwo(int powerOfNum) {
        int num=1;

        for (int i=1; i <= powerOfNum; i++){
            num = num * 2;
        }
        System.out.println(num);
        return num;
    }
}
