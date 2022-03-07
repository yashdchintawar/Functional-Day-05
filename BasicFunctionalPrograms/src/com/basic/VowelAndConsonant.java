package com.basic;

import java.util.Scanner;

public class VowelAndConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Alphabet");

        char alpha = in.next().charAt(0);
        checkAlphabet(alpha);
    }

    public static void checkAlphabet(char a) {
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){
            System.out.println(a+" Is A Vowel");
        }
        else {
            System.out.println(a+" Is A Consonant");
        }
    }
}
