package com.sunbeam.day5.menudriven;

import java.net.Socket;
import java.util.Scanner;

public class Menu {

    public static int menu(){
        System.out.println("0. exit");
        System.out.println("1. Add Student");
        System.out.println("2. Display All Student");
        System.out.println("3. Search Student");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice...");
        int choice = sc.nextInt();
        System.out.println("----------------------------------");
        return choice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        Student s[] = new Student[3];
        int index=0;
        while((choice=menu())!=0){
            switch (choice){
                case 1:
                    if(index<s.length){
                        s[index] = new Student();
                        s[index].addStudent();
                        index++;
                    }else {
                        System.out.println("seat are fulls ");
                    }
                    System.out.println("Add Student..");
                    break;
                case 2:
                    System.out.println("Display All Student..");
                    for(Student st :s ){
                        if(st!=null)
                            st.display();
                    }
                    break;
                case 3:
                    System.out.println("Search Student..");
                    System.out.println("Enter Roll no: ");
                    int roll;
                    roll = sc.nextInt();
                    for(Student st: s){
                        if (st!=null && st.getRoll_no()==roll){
                            st.display();
                        }
                    }

                    break;
                default:
                    System.out.println("Wrong chioce.. please enter choice again");
            }

        }

    }
}
