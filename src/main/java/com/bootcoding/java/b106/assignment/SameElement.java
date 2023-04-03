package com.bootcoding.java.b106.assignment;

public class SameElement {
    public static void main(String[] args) {
        int[] ar= {7, 22, 19, 44, 45, 65, 7};
            if(ar[0] == ar[ar.length-1]){
                for (int i=0; i<ar.length; i++){
                    System.out.println(ar[i]);
                }
            }
        }
    }


