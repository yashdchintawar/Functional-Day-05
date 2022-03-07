package com.basic;

import java.util.Scanner;

public class QutientReminder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Dividend !");
        int dividend = in.nextInt();
        System.out.println("Enter Divisor !");
        int divisor = in.nextInt();

        int quot = quotient(dividend,divisor);
        System.out.println("Quotient Is: " +quot);

        int rem = reminder(dividend,divisor);
        System.out.println("Reminder Is: " +rem);
    }

    public static int quotient(int dividend, int divisor){
        int quot = dividend / divisor ;
        return quot;
    }

    public static int reminder(int dividend, int divisor){
        int rem = (dividend % divisor);
        return rem;
    }
}
