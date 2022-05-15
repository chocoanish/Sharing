package com.School_Project;

class Calculator{
    void num_calc(int num,char ch) {
        if (ch == 's') {
            num = num * num;
        } else {
            num = num * num * num;
        }
        System.out.println(num);
    }
    void num_calc(int a,int b,char ch){
        int p=0;
        if (ch=='p'){
            p=a*b;
        }
        else{
            p=a+b;
        }
        System.out.println(p);
    }
    void num_calc(String s1, String s2){
        if (s1.equals(s2)){
            System.out.println("The Strings are equal");
        }
        else {
            System.out.println("The Strings are not equal");
        }
    }

    public static void main(String[] args) {
        Calculator d=new Calculator();
        d.num_calc(3,'s');
        d.num_calc(2,3,'p');
        d.num_calc("Equal","Equal");
    }
}
