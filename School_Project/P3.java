package com.School_Project;
class prime {
    public static boolean is_prime(int a) {
        boolean prime=false; // for checking a is prime or not.
        int count= 0;      // for counting the factors of a.
        for (int i = 1; i <= a; i++) {
                if (a%i == 0) {      // for checking i is a factor of a or not.
                    count++;
                }
            }
            if (count == 2) {       // count =2 because prime no. have only 2 factors.
                prime=true;
            }
            return prime;           // it return true if no. is prime and false if no. is not a prime.
        }
    }
public class P3 {
    public static void main(String[] args) {
        for (int i=10;i<=100;i++){              // loop of range 10 to 100.
            if (prime.is_prime(i) && prime.is_prime(i+2)){     // if both became true the pair is called twin prime.
                System.out.printf("(%d,%d)",i,i+2);
            }
        }
    }
}
