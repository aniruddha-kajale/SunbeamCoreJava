package com.sunbeam.day6.association;

import java.util.Scanner;

public class Employee {
    private int empId;
    private String name;
    private double salary;

    Date d1;    // reference of Date Class

    public void acceptEmployee(Scanner sc){
        System.out.println("Enter emp id:");
        empId = sc.nextInt();
        System.out.println("Enter name:");
        name = sc.next();
        System.out.println("Enter salary:");
        salary= sc.nextDouble();

    }

    public void displayEmployee(){
        System.out.println("Emp Details: ");
        System.out.println(empId+"\n"+name+"\n"+salary);
//        d1.displayDate();
    }

}
