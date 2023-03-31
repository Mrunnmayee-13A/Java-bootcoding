package com.bootcoding.java.b106.assignment;

public class TimeMethodEx1 {
    public static void main(String[] args) {
        int n= 5;
        int con = MintoSec(n);
        System.out.println("5 min = "+con+" sec");
    }
    public static int MintoSec(int n){
        int sec= n*60;
        return sec;
    }
}















/*Write a method that takes an integer minutes and converts it to seconds.
For Example 1:
Input: 5
Output: 300
Description: convert(5) → 300
For Example 2:
Input: 2
Output: 120
Description: convert(2) → 120*/