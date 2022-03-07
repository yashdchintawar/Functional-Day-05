package com.basic;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter First Number");
        int a = in.nextInt();

        System.out.println("Enter Second Number");
        int b = in.nextInt();

        System.out.println("Before Swapping First = "+a+" & Second is: "+b);

        swapTwoNum(a,b);
    }

    public static void swapTwoNum(int num1, int num2) {
//      int temp;

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swapping First = "+num1+" & Second is: "+num2);

    }
}
