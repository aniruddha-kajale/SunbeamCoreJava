package com.sunbeam.day3.methodOverloading;

public class ConstructorOverloading {

    int a,b;

    ConstructorOverloading(){
        this(10,30);
    }

    ConstructorOverloading(int a,int b){
            this.a=a;
           this.b=b;
    }

    public void display(){
        System.out.println(a+"="+b);
    }

    public static void main(String[] args) {
        ConstructorOverloading co = new ConstructorOverloading();
        co.display();

        ConstructorOverloading co2 = new ConstructorOverloading(30,45);
        co2.display();
    }

}
