package com.bootcoding.java.b106.assignment;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] ar={7, 22, 19, 44, 45, 65, 66};
        int sum=0;

        for(int i=0; i<ar.length; i++){
            sum = sum + ar[i];
        }

        System.out.println("Sum of the array elements = " +sum);

    }
}
