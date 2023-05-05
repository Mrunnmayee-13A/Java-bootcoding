package com.bootcoding.java.b106.assignment;

public class CopyElement {
    public static void main(String[] args) {
        int a[] = {7, 22, 19, 44, 45, 22, 17};
        int b[] = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        System.out.println("Elements copied are -");

        for (int i=0; i<b.length; i++){
            System.out.println(b[i]+ " ");
        }
      }
    }

