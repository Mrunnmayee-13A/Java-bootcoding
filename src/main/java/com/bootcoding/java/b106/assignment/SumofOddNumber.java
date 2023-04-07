package com.bootcoding.java.b106.assignment;

public class SumofOddNumber {
    public static void main(String[] args) {
        int[] a = {7, 22, 19, 44, 45, 65, 66};
        int sum = 0;
        for (int i=0; i<a.length; i++){
            if (a[i]%2!=0){
                sum = sum+a[i];
            }
        }
        System.out.println("Sum of all the odd elements is ="+sum);
    }
}





