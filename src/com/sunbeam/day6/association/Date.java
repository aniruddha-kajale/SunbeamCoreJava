package com.sunbeam.day6.association;

import java.util.Scanner;

public class Date {
    int day;
    int month;
    int year;

    public void acceptDate(Scanner sc){
        System.out.println("Enter day:");
        day=sc.nextInt();
        System.out.println("Enter month:");
        month=sc.nextInt();
        System.out.println("Enter year:");
        year = sc.nextInt();
    }

    public void displayDate(){
        System.out.println("date :-"+day+"/"+month+"/"+year);
        System.out.println("-----------------------------------");
    }
}
