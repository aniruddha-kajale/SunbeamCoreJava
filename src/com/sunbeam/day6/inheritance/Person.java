package com.sunbeam.day6.inheritance;

import java.util.Scanner;

public class Person {

    private String name;
    private String mobileNo;

    public Person(){
        System.out.println("Person Class ctor");
    }

//    Accept the person data from user
    public void acceptPerson(Scanner sc){
        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println("Enter mobile no: ");
        mobileNo = sc.next();
    }

//    display person
    public void displayPerson(){
        System.out.println("name: "+name);
        System.out.println("Mobile: "+mobileNo);
    }
}
