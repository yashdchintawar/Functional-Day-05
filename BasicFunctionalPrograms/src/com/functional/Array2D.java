package com.functional;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Column Size");
        int col = in.nextInt();
        System.out.println("Enter Row Size");
        int row = in.nextInt();

        twoDArray(row,col);
    }

    public static void twoDArray(int column, int row) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter Value For " + i + "&" + j);
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
