package com.sunbeam.day5.student;

import java.util.Scanner;

public class Student {
    private int roll_no;
    private String name;
    private double percentage;
    private static int generateRollNo = 0;

    {
        System.out.println("instance/object intializer...");
        generateRollNo++;
        roll_no = generateRollNo;
    }

    public Student(){
        System.out.println("parameterless ctor");
//        generateRollNo++;
//        roll_no = generateRollNo;
    }

    public Student(String name,double percentage){
        System.out.println("Parameterized ctor");
        this.name = name;
        this.percentage = percentage;
//        generateRollNo++;
//        roll_no = generateRollNo;
    }


    public void display(){
        System.out.println("name :"+name);
        System.out.println("RollNo :"+roll_no);
        System.out.println("Percentage :"+percentage);
    }


}
