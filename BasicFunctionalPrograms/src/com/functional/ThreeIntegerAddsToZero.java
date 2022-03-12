package com.functional;

import java.util.Scanner;

public class ThreeIntegerAddsToZero {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Size of an Array");
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i =0 ; i < n ; i++){
            arr[i] = in.nextInt();
        }
        triplets(arr,n);
    }

    public static void triplets(int[] arr, int n)
    {
        boolean found = false;

        for (int i  = 0 ; i < n-2 ; i++){
            for (int j = i+1 ; j < n-1 ; j++){
                for (int k = j+1 ; k < n ;k++ ){
                    if ((arr[i]+arr[j]+arr[k]) == 0){
                        System.out.println(arr[i]);
                        System.out.println(arr[j]);
                        System.out.println(arr[k]);
                        found = true;
                    }
                }
            }
        }
        if(found!=false){
            System.out.println("Triple Format not Found");
        }
    }
}
