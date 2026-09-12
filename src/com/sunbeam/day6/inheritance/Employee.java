package com.sunbeam.day6.inheritance;

import java.util.Scanner;

public class Employee {

    private int empID;
    private double salary;

    public Employee(){
        System.out.println("Employee Ctor..");
    }

    public void acceptEmp(Scanner sc){
        System.out.println("Enter the empid: ");
        empID = sc.nextInt();
        System.out.println("Enter the salary");
        salary = sc.nextDouble();
    }

    public void displayEmp(){
        System.out.println("Empid: "+empID);
        System.out.println("Salary :"+salary);
    }

}
