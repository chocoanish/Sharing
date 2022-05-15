package com.School_Project;

import java.util.Scanner;

public class P1 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your monthly salary");
        int income = sc.nextInt()*12;  /* taking monthly salary from the user and multiplying
                                          it by 12 as to make it annual salary.*/
        double tax = 0.0;
        if(income <= 100000){
            tax =0;                    // tax 0 if income is below Rs1,00,000.
        }
        else if(income > 100000 && income <= 500000){
            tax = 1000+(income-100000)*0.1;      /* tax is 10% of income exceeding Rs1,00,000
                                                    +Rs1,000 if income is above Rs1,00,000
                                                    and below Rs5,00,000.*/
        }
        else if(income > 500000 && income <= 800000){
            tax = 5000+(income-500000)*0.2;      /* tax is 20% of income exceeding Rs5,00,000
                                                    +5,000 if income is above Rs5,00,000
                                                    and below Rs8,00,000.*/
        }
        else if(income >800000){
            tax = 10000+(income-800000)*0.3; /* tax is 30% of income exceeding Rs8,00,000
                                                +10,000 if income is above Rs8,00,000.*/
        }
        System.out.println("Your annual income is: "+income+" and the tax paid is: "+tax);
    }

}
