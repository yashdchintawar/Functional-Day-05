package com.basic;

import java.util.Scanner;

public class FlipCoinPercentage {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter How Much Time Coin Should Flip");
        int flip = in.nextInt();

        int flipPercentage = flipCoinPercentage(flip);
        int tailans;
        tailans = flipPercentage - 100;

        System.out.println("Head Percentage is: " + flipPercentage);
        System.out.println("Tail Percentage is: " +tailans);
    }

    public static int flipCoinPercentage(int flipCoin) {

        int head = 0;
        int tail = 0;
        for(int i = 1; i <= flipCoin; i++) {
            int flip = (int) (Math.random()*2);
            if(flip == 1) {
                head = head+1;
            }
            else {
                tail = tail+1;
            }
        }
        int percentageOfHead = (int) (head / (double) flipCoin * 100);
        return(percentageOfHead);
    }

}
