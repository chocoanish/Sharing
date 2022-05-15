package com.School_Project;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter HourlyRate: ₹");
        double R = sc.nextDouble();          // taking Rupees per hour from user.
        System.out.print("Enter the Work hours: ");
        int H = sc.nextInt();                // taking No. of working hours.
        double wages = 0;
        if (H <= 35) {
            wages = H * R;                   // wages for less than 35 working hours.
        }
        else if (H > 35 && H <= 60) {
            wages = (1.5 * R) * H;               // wages for more than 35 and less than 60 working hours.
        }
        else if (H > 60 && H <= 168) {
            wages = (2 * R) * H;         // wages for above 60 working hours.
        }
        System.out.println("The weekly wages are ₹" + wages);
    }
}