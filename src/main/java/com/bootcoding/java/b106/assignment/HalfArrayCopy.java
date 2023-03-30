package com.bootcoding.java.b106.assignment;

public class HalfArrayCopy {
    public static void main(String[] args) {
        int a[] = {7, 22, 19, 44, 45, 22, 17};
        int b[] = new int[a.length/2];
        for (int i = 0; i < a.length/2; i++) {
            b[i] = a[i];
        }
        System.out.println("Elements are -");
        for (int i=0; i<b.length; i++){
            System.out.println(b[i]+ " ");
        }
    }
}
