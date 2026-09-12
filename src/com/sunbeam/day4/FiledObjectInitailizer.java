package com.sunbeam.day4;

public class FiledObjectInitailizer {

    private int n1 = 10; // field Initializer
    private int n2;
    private int n3;


    {
        System.out.println("Object initializer");
        n2=100; // object initializer
    }

    FiledObjectInitailizer(){
        System.out.println("Con initializer");
        n3=300;
    }

    public void display(){
        System.out.println("n1:"+n1);
        System.out.println("n2:"+n2);
        System.out.println("n3:"+n3);
    }

    public static void main(String[] args) {
        FiledObjectInitailizer t1 = new FiledObjectInitailizer();
        t1.display();

        FiledObjectInitailizer t2 = new FiledObjectInitailizer();
        t2.display();
    }

}
