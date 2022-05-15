package com.School_Project;

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = sc.nextLine();  // taking a string from user.

        String word = "";      // initializing an empty string.
        String palindrome = "";  // initializing an empty string.

        System.out.println("The palindrome words are: ");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);      // storing 0th index letter in ch.
            if (ch != ' ') {              // checking ch not equal to space.
                word += ch;               // storing ch in word.
            }
            else {
                for (int j = word.length() - 1; j >= 0; j--) {   // loop for reversing string word.
                    palindrome += word.charAt(j);
                }
                if (palindrome.equalsIgnoreCase(word)) {       // checking a the word is palindrome or not.
                    System.out.println(word);
                }
                //reinitializing the strings to empty.
                word = "";
                palindrome = "";
            }
        }
    }
}