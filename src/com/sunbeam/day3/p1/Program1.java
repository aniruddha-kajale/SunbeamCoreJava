package com.sunbeam.day3.p1;

public class Program1 {
    private int a;
     int b;
     protected int c;
     public int d ;

 public void displayValues(){
     System.out.println("a: "+a+" b: "+b+" c: "+c+" d: "+d);
 }

    public static void main(String[] args) {
        Program1 p1 = new Program1();

//        accessible in same class
    p1.a =100;
    p1.b= 200;
    p1.c =400;
    p1.d= 500;

    p1.displayValues();
    }

}
