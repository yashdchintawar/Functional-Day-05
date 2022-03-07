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
        for (int i=0; i<n-2; i++)
        {
            for (int j=i+1; j<n-1; j++)
            {
                for (int k=j+1; k<n; k++)
                {
                    if (arr[i]+arr[j]+arr[k] == 0)
                    {
                        System.out.print(arr[i]);
                        System.out.print(" ");
                        System.out.print(arr[j]);
                        System.out.print(" ");
                        System.out.print(arr[k]);
                        System.out.print("\n");
                        found = true;
                    }
                }
            }
        }

        // If no triplet with 0 sum found in array
        if (found == false) {
            System.out.println(" not exist ");
        }
    }
}
