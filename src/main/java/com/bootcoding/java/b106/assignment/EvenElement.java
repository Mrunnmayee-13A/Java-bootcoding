package com.bootcoding.java.b106.assignment;

public class EvenElement {
    public static void main(String[] args) {
        int[] ar= {7, 22, 19, 44, 45, 65, 66};
        for(int i=0; i<ar.length; i++) {
            if (ar[i] % 2 == 0) {
                System.out.println(ar[i]);
            }
          }
        }
    }

