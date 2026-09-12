package com.sunbeam.day4;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i =0 ;i<arr.length;i++){
            System.out.println("Enter value :"+(i+1));
            arr[i] = sc.nextInt();
        }

       for(int a:arr){
           System.out.println(a);
       }
    }
}
