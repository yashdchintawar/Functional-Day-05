package com.basic;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Number for Prime Factors!");
        int num = in.nextInt();

        int factors = primeFactor(num);
    }

    public static int primeFactor(int num){

        if (num>0)
        {
            while (num%2==0)
            {
                System.out.print(2 + " ");
                num /= 2;
            }

            for (int i = 3; i <= Math.sqrt(num); i+= 2)
            {
                while (num%i == 0)
                {
                    System.out.print(i + " ");
                    num /= i;
                }
            }
            if (num > 2)
                System.out.print(num);
        }
        return 0;
    }
}
