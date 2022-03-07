package com.basic;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Year To Check Leap Year Or Not ?");
        int year = in.nextInt();

        boolean leapYearAns = isLeapYear(year);

        if (leapYearAns){
            System.out.println(year+" Is A Leap Year");
        }
        else {
            System.out.println(year+" Is Not A Leap Year");
        }

    }

    public static boolean isLeapYear(int leapYear) {
        int ans;
        if (leapYear % 4 == 0){
            if (leapYear % 100 == 0){
                if (leapYear % 400 == 0){
//                  Is a Leap Year
                    return true;
                }
                else{
//                  Is a Not Leap Year
                    return false;
                }
            }
            else{
//              Is a Leap Year
                return true;
            }
        }
        else{

//          Is Not A Leap Year
            return false;

        }

    }
}
