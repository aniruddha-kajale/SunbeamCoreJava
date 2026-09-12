package com.sunbeam.day5.menudriven;

import java.util.Scanner;

public class Student {

   private int roll_no;
   private String name;
   private double percentage;
   private static int generateRollNo=0;

    {
        generateRollNo++;
        roll_no = generateRollNo;
    }

   public Student(){

    }

    public Student(String name, double percentage){
        this.name = name;
        this.percentage = percentage;
    }
    public void display(){
        System.out.println("RollNo: "+roll_no);
        System.out.println("name: "+name);
        System.out.println("Percentage :"+percentage);
        System.out.println("---------------------------------------");
    }

    public void addStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of student: ");
        name = sc.nextLine();
        System.out.println("Enter percentage of student: ");
        percentage = sc.nextDouble();
    }

    public int getRoll_no(){
        return roll_no;
    }

}
