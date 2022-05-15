package com.School_Project;

import java.util.Scanner;

class tocompare{
    void compare(int a, int b){    // function to compare to numbers.
        if(a > b){
            System.out.println(a+" is greater.");
        }
        else {
            System.out.println(b+" is greater.");
        }
    }
    // method(compare) overloading
    void compare(char a, char b){    // function to compare to character value.
        int ch1= a;
        int ch2=b;
        if (ch1 > ch2){
            System.out.println(a+" is greater, with its numeric value is "+ch1);
        }
        else {
            System.out.println(b+" is greater, with its numeric value is "+ch2);
        }
    }
    // method(compare) overloading
    void compare(String a,String b){  // function to compare length of Strings.
        if(a.length()>b.length()){
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
    }
}
public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1) Write Number ==> comparing two Numbers" +
                "\n2) Write Character ==> comparing two Characters\n" +
                "3) Write String ==> comparing two Strings");
        String response = sc.nextLine();  // taking response from the user.
        tocompare obj = new tocompare();  // declaring an object.
        if (response.equalsIgnoreCase("Number")){
            int a=sc.nextInt();     // taking input.
            int b=sc.nextInt();
            obj.compare(a,b);    // calling method.
        }
        else if (response.equalsIgnoreCase("Character")){
            char a=sc.next().charAt(0);   // taking input.
            char b=sc.next().charAt(0);
            obj.compare(a,b);     // calling method.
        }
        else if (response.equalsIgnoreCase("String")){
            String a=sc.nextLine(); // taking input.
            String b=sc.nextLine();
            obj.compare(a,b);     // calling method.
        }
        else {
            System.out.println("invalid Input.");   // printing it,if the user input is wrong.
        }
    }
}
