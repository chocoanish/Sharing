package com.School_Project;

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String input= sc.nextLine();   // taking a string from the user.
        String str=input.toUpperCase();  // converting string in uppercase.
        char ch=' ';
        for (int i=0; i<str.length();i++){ // loops for the pattern.
            for (int j=0; j<=i;j++){
                ch=str.charAt(j);       // storing char at index 0 in str.
                System.out.print(ch);
            }
            System.out.println();   // for changing the line.
        }
    }
}
