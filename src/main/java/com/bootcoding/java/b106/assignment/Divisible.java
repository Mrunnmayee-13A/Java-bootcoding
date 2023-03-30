package com.bootcoding.java.b106.assignment;

public class Divisible {
    public static void main(String[] args) {
        int[] n = {6, 22, 19, 46, 45, 65, 7};
            for (int i = 0; i < n.length; i++){
            if (n[i] % 3 == 0 && n[i] % 5==0) {
                System.out.println("Number " + n[i] + " is divisible by 3 & 5");
            }
         }
      }
   }

