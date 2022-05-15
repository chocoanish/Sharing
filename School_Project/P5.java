package com.School_Project;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int int_sum=0;
        double deci_sum=0;

        System.out.println("Enter 10 decimal numbers");
        for (int i = 1; i <= 10; i++) {   // to take 10 input.
            double num = sc.nextDouble();  // to take the input from user.
            int integer = (int) num;       // taking out integer part from num.
            double decimal = num - integer;  // taking out decimal part from num.
            int_sum+=integer;               //  sum of integer parts of 10 numbers.
            deci_sum+=decimal;              // sum of decimal parts of 10 numbers.
        }
        System.out.println("Sum of integer part: "+int_sum);  // printing the sum of integer part.
        System.out.println("Sum of decimal part: "+deci_sum); // printing the sum of decimal part.
    }
}