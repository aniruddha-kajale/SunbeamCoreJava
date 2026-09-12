package com.sunbeam.day5.singleton;

public class Test {
    private static Test t = new Test();
    int a;
    int b;
    int c;


    private Test(){

    }

    public static Test getTest(){
        return t;
    }

    public void setA(int a){
        this.a = a;
    }

    public void setB(int b){
        this.b = b;
    }
    public void setC(int c){
        this.c = c;
    }

   public void display(){
       System.out.println("add is :"+(a+b+c));
   }

}

class ABC{
    public static void main(String[] args) {
        Test t1 = Test.getTest();
        t1.setA(10);
        t1.setB(5);
        t1.setC(5);

        t1.display();

        Test t2 = Test.getTest();
        t2.display();

    }
}
