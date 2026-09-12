package com.sunbeam.day6.inheritance;

import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee();
        e1.acceptEmp(sc);
        e1.displayEmp();

        Employee e2 = new Employee();
        e2.acceptEmp(sc);
        e2.displayEmp();


    }
}
