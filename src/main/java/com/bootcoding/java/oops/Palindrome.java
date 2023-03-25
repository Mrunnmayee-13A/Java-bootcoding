package com.bootcoding.java.oops;

public class Palindrome {
    public static void main(String [] input){

        int n1= Integer.parseInt(input[0]);
        int temp= n1;
        int rem =0;

        while (n1!=0){
             rem= rem*10+n1%10;
             n1=n1/10;
        }
        if(temp== rem) {
            System.out.println(temp +" is a Palindrome number.");
        }else{
            System.out.println(temp +" is not Palindrome number.");
        }
    }
}
