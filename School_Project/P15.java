package com.School_Project;

class Calculate {
    int sumOfDigits(int n){
        int i=0;
        int s=0;
        while(n!=0){
            i=n%10;
            s+=i;
            n/=10;
        }
        return s;
    }
    void magical(int num) {
        while (num> 9) {
           num = sumOfDigits(num);
        }
        System.out.println("The number is a magical number.");
    }
    public static void main(String[] args) {
        Calculate a=new Calculate();
        a.magical(8945);
    }
}
