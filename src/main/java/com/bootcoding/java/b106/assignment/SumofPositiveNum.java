package com.bootcoding.java.b106.assignment;

public class SumofPositiveNum {
    public static void main(String[] args) {
        int a[] ={10,-20,-2,-2};
        int res= PositiveNoSum(a);
        System.out.println("The sum of positive numbers is = "+res);
    }
    public static int PositiveNoSum(int a[]){
        int sum=0;
        for (int i=0; i< a.length; i++){
            if(a[i]>=0){
                sum=a[i]+sum;
            }
        }
        return sum;
    }
}

