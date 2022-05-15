package com.School_Project;

import java.util.Scanner;

class number{
    public static int factorial(int a){    // method for factorial of a number.
        int p =1;
        for(int i=1;i<=a;i++){
            p=p*i;                    // expression to calculate the factorial
        }
        return p;             // returning the factorial.
    }

    public static void factors(int a){   // method for factors of a number.
        System.out.print("[");
        for(int i=1;i<a;i++){
            if (a % i == 0) {          // checking i is the factor of a or not.
                System.out.print(i+",");
            }
        }
        System.out.println(a+"]");
    }
}

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Factorial of a Number ==> Write Factorial." +
                "\n2. Factors of the Number. ==> Write Factor");
        System.out.print("Your Response: ");
        String response = sc.nextLine();       // taking response from the user.

        if (response.equalsIgnoreCase("Factorial")){   // for factorial.
            System.out.println("Input a Number");
            int num1=sc.nextInt();   // taking number to take out the factorial of.
            System.out.println(number.factorial(num1)); // printing factorial by calling a function.
        }
        else if (response.equalsIgnoreCase("Factor")){ // for factors.
            System.out.println("Input a Number");
            int num2=sc.nextInt();   // taking number to take out the factors of.
            number.factors(num2);    // printing factors by calling a function.
        }
    }
}
