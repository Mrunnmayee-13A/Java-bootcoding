package com.bootcoding.java.b106.assignment;

public class MaxElement {
    public static void main(String[] args) {

        int[] a = {7, 22, 19, 44, 45, 65, 7};
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if(max<a[i]){
                max= a[i];
            }
        }
        System.out.println("Maximum element of an array = " +max);
    }
}