package com.functional;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        double windChill;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Temperature (T) :- ");
        double t = in.nextDouble();

        System.out.println("Enter Speed (V) :- ");
        double v = in.nextDouble();

        if (t < 50 && v < 120 && v > 3){
            windChill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v,0.16);
            System.out.println("Wind Chill Is: " + Math.floor(windChill));
        }
        else {
            System.out.println("Values Are Not Valid ");
        }
    }
}
