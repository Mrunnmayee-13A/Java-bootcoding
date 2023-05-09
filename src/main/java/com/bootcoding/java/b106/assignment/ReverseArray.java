package com.bootcoding.java.b106.assignment;

public class ReverseArray {
    public static void main(String[] args) {
        int [] ar ={10, 20, 30, 40, 50};
        int temp =0;
        for ( int i = 0; i<ar.length; i++){
          temp= ar[i];
          ar[i]=ar[ar.length-1];
            ar[ar.length-1]=temp;
        }

        for(int j=0; j<ar.length; j++)
        System.out.print(ar[j]+" ");
        // swapping
    }
}
