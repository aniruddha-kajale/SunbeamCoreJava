package com.sunbeam.day2;

class Date{

    int day;
    int month;
    int year;


    public void displayDate(){
        System.out.println(day + "/" + month + "/" + year);
    }
    public void setDate(int d, int m, int y){
        day = d;
        month = m;
        year = y;
    }
}

public class MemoryAllocation {

    public static void main(String[] args) {
            Date d1 ;
            d1 = new Date();
            d1.setDate(15, 8, 2023);
            d1.displayDate();


    }
}
