package com.basic;

import java.util.Scanner;

public class LargestAmoung3 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Enter First Number");
        int num1 = in.nextInt();

        System.out.println("Enter Second Number");
        int num2 = in.nextInt();

        System.out.println("Enter Third Number");
        int num3 = in.nextInt();

        largestFromThree(num1,num2,num3);
    }

    public static void largestFromThree(int a, int b, int c){
        if(a>b){
            if (a>c){
                System.out.println("Largest Number Is: "+a);
            }
            else {
                System.out.println("Largest Number Is: "+c);
            }
        }

        else if (b>c){
            System.out.println("Largest Number Is: "+b);
        }

        else{
            System.out.println("Largest Number Is: "+c);
        }
    }
}
