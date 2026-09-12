package com.sunbeam.day5.singleton;

public class DataBaseConnection {

    private int a ;
    private int b;

    private static DataBaseConnection db = null;
    private static DataBaseConnection db1 = new DataBaseConnection();

    private DataBaseConnection(){
            a=b=10;
    }

    public static DataBaseConnection getInstance(){
        return db1;
    }

    public void dis(){
        System.out.println(a);
        System.out.println(b);
    }


}

class Program{
    public static void main(String[] args) {
        DataBaseConnection db1 = DataBaseConnection.getInstance();
        db1.dis();
    }
}
