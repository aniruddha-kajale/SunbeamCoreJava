package com.sunbeam.day4;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] jaa = new int[2][];
       jaa[0] = new int[3];
       jaa[1] = new int[2];

       for(int i=0;i<jaa.length;i++){
           int in_array[] = jaa[i];

           for(int j=0;j<in_array.length;j++){
               System.out.println(in_array[j]);
           }

       }
    }
}
