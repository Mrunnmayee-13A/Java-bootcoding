package com.bootcoding.java.b106.assignment;

public class MinElement {
    public static void main(String[] args) {
        int[] a= {22, 19, 44, 7, 45, 65};
        int min = a[0];
        for(int i=0; i<a.length; i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("Minimum element of the array = " +min);
    }
}
