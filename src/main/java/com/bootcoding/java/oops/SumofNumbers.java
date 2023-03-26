package com.bootcoding.java.oops;

public class SumofNumbers {
    public static void main(String[] input) {
        String calculate = input[0];
        int n1 = Integer.parseInt(input[0]);
        int n2 = Integer.parseInt(input[1]);
        int n3 = Integer.parseInt(input[2]);
        int sum = n1 + n2 + n3;
        System.out.println("Sum of numbers is= " + sum);
    }
}
