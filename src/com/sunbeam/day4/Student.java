package com.sunbeam.day4;

import java.util.Scanner;

public class Student {
    int roll;

    Student(int roll){
        this.roll = roll;
    }

    public void display(){

        System.out.println("Roll:"+roll);

    }

    public static void main(String[] args) {
        Student[] std = new Student[5];
        Scanner sc = new Scanner(System.in);

        int roll;

        for (int i=0;i<std.length;i++){
            System.out.println("enter name,roll and marks :");

            roll = sc.nextInt();

            std[i] = new Student(roll);
        }
        for (Student e : std){
            e.display();
            System.out.println("----------------------------------");
        }
    }
}
