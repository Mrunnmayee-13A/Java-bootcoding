package com.bootcoding.java.oops;

public class EvenOddSum {
    public static void main(String[] args){
       int sum=0;
       int oddsum=0;
       for(int i=0; i<args.length; i++) {
           int n = Integer.parseInt(args[i]);
           if (n % 2 == 0) {
               sum = sum + n;

           } else {
               oddsum = oddsum + n;
           }
       }
        System.out.println("The sum of even number is= " + sum);
       System.out.println("The sum of odd number is= " +oddsum);

    }
}
