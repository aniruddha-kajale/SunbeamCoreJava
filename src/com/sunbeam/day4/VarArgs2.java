package com.sunbeam.day4;

public class VarArgs2 {

    /**
     * so without VarAgrs method for each number of parameter we have to declare separate method
     * but when we use args... param them only one method can work for multiple no of param
     */

//    public static void add(int a,int b){
//        System.out.println("addition is :"+(a+b));
//    }
//    public static void add(int a,int b,int c){
//        System.out.println("addition is :"+(a+b+c));
//    }
//    public static void add(int a,int b,int c,int d){
//        System.out.println("addition is :"+(a+b+c+d));
//    }

    public static void add(int ...arg){

        int res=0;
        for (int a: arg){
            res+=a;
        }

        System.out.println("Addition is :"+res);

    }

    public static void main(String[] args) {
//        add(1,2);
//        add(4,5,2);
//        add(54,65,33,55);
        add(4);
        add(4,6,4,6,4,7);

    }
}
