package com.School_Project;

import java.util.Arrays;
import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int []arr=new int[10];     // initializing an array of lenght 10.
        int b;
        for (int i=0; i<arr.length; i++) {   // loop for storing inputs from user in arr.
            int num =sc.nextInt();
            arr[i]=num;
        }
        for (int i=0;i<arr.length-1;i++){       // loop for sorting arr.
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){      /* if value of jth index is > j+1th index,
                                              the following swaps the value.*/
                    b=arr[j];        // storing jth index value in b.
                    arr[j]=arr[j+1];  // storing j+1th index at jth index.
                    arr[j+1]=b;      // storing b at j+1th index.
                }
            }
        }
        System.out.println(Arrays.toString(arr));  /* printing the sorted array
                                                    in a format of a string.*/
    }
}
