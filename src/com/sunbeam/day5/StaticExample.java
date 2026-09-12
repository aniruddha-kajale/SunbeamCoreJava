package com.sunbeam.day5;

public class StaticExample {

    /**
     * Static it is a keyword in java, we can use this keyword with
     * 1. fields
     * 2. Methods
     * 3. Nested Class
     * <p>
     * Static keyword is used for sharing
     * for static variable memory allocated only once's in the program in the method area, static variable is common for all the object
     * static variable used for common variable of class
     */

    int radius;
     static double  PI = 3.14;

    StaticExample(int radius){
        this.radius = radius;
    }

    public void calculateArea(){
        System.out.println("Area of Class is : "+(radius*radius*PI));
    }
}

class ABC{
    public static void main(String[] args) {
        StaticExample ss = new StaticExample(10);
        ss.calculateArea();
        StaticExample ss2 = new StaticExample(20);
        ss2.calculateArea();
    }
}

