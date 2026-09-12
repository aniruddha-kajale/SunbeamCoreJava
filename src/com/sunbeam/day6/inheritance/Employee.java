package com.sunbeam.day6.inheritance;

import com.sunbeam.day6.association.Date;

import java.util.Scanner;

public class Employee extends Person{

    private int empID;
    private static int generateEmpId = 0;
    private double salary;
    private Date doj = new Date();

    public Employee(){
        System.out.println("Employee Ctor..");
        generateEmpId++;
        empID = generateEmpId;
    }

    public void acceptEmp(Scanner sc){
        acceptPerson(sc);
//        System.out.println("Enter the empid: ");
//        empID = sc.nextInt();
        System.out.println("Enter the salary");
        salary = sc.nextDouble();
        doj.acceptDate(sc);
    }

    public void displayEmp(){
        System.out.println("Empid: "+empID);
        displayPerson();
        System.out.println("Salary :"+salary);
        doj.displayDate();
    }

}
