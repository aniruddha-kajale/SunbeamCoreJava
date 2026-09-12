package com.sunbeam.day4;

public class VarArgs {
//
//    public static void show(int a,int b){
//        System.out.println("method 2 param "+a+"\t "+b);
//    }
//
//    public static void show(int a,int b,int c){
//        System.out.println("method 3 param "+a+"\t "+b+"\t"+c);
//    }

//    public static void show(int arr[]){
//        System.out.println("method "+arr.length+" param :");
//        for(int a:arr){
//            System.out.print("\t"+a);
//        }
//        System.out.println();
//    }

    public static void show(int ...arr){
        System.out.println(" method param of ->>"+arr.length+" :");
        for (int a : arr){
            System.out.print(a+"\t");
        }
    }

    public static void main(String[] args) {
        show(1,3);
        show(2,4,5);
        show(4,6,7,4354,44,654,6456,4);



    }

}
