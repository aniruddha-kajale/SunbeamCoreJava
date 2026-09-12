package com.sunbeam.day3.methodOverloading;

public class MethodOverloading {

    public void add(int a, int b){
        System.out.println("addition is :"+a+b);
    }

    public void add(double a,int b){
        System.out.println("addition of float and int : "+a+b);
    }

    public static void main(String[] args) {
//        method overloading means creating multiple methods of same name in a same class with
//        number of param are diff, type of param are diff and order of param should be diff...
        MethodOverloading mo = new MethodOverloading();
        mo.add(10,20);
        mo.add(30.4,45);

    }
}
