package com.bootcoding.java.b106.assignment;

import javax.naming.PartialResultException;

public class SameElementofArray {
    public static void main(String[] args) {
        int[] ar = {7, 22, 19, 44, 45, 21, 17};
       if(ar[1]==ar[ar.length-2]){
           for(int i=0; i<ar.length; i++){
                   System.out.println(ar[i]);
               }
           }else{
           System.out.println("Elements are not same at respective position.");
       }
       }
    }
