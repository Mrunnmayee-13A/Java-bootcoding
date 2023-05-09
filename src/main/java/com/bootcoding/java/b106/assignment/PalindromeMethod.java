package com.bootcoding.java.b106.assignment;

public class PalindromeMethod {
    public static void main(String[] args) {
        int[] a = {10, 121, 191, -34, 20, 0, 111};
        int r = 0;
        r = PalindromeNum(a);
        System.out.println("Palindrome numbers are - " + r);
    }
    public static int PalindromeNum(int a[]) {
        int rem =0;
        for(int i=0; i<a.length-1; i++){
            int num= a[i];
            while(num!=0){
                rem=rem*10+num%10;
                num=num/10;
            }
            if(rem==a[i]){

            }

        }
        return rem;
    }
}









