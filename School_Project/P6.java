package com.School_Project;

import java.util.Scanner;
public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();   // taking a string from user.
        char ch=' ';                // initializing an empty char.
        String newstr="";           // initializing an empty string.
        for (int i=0;i<str.length();i++) {
            ch = str.charAt(i);        // storing 0th index value of a string str.
            if (Character.isUpperCase(ch)) {     // checking for uppercase letters.
                newstr += Character.toLowerCase(ch);  /* converting them in lowercase
                                                         and storing them in a newstr.*/
            } else if (Character.isLowerCase(ch)) {   // checking for lowercase letters.
                newstr += Character.toUpperCase(ch);  /* converting them in uppercase
                                                         and storing them in a newstr.*/
            } else {
                newstr += ch;        // for special letters and numbers.
            }
        }
        System.out.println("Old string: "+str);   // printing old string.
        System.out.println("New string: "+newstr); // printing new string.
    }
}
