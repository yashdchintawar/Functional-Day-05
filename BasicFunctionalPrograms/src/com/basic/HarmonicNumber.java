package com.basic;

import java.util.Scanner;

public class HarmonicNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Nth Number For Harmonic Number !");
        int num = in.nextInt();

        double nthNum = nthHarmonic(num);
        System.out.println("Nth Harmonic Number Is: " +nthNum);
    }

    public static double nthHarmonic(int N)
    {
        // H1 = 1
        float harmonic = 1;

        for (int i = 2; i <= N; i++) {
            harmonic += (float)1 / i;
        }

        return harmonic;
    }
}
