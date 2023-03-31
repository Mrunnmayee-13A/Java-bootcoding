package com.bootcoding.java.b106.assignment;

public class PalindromeMethod {
    public static void main(String[] args) {
        int a[] = {10, 121, 191, -34, 20, 0, 111};
        int r = 0;
        r = PalindromeNum(a);
        System.out.println("Palindrome numbers are - " + r);
    }

    public static int PalindromeNum(int a[]) {
        int rem = 0;
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            while (temp != 0) {
                rem = rem * 10 + temp % 10;
                temp = temp / 10;
            }
            if (temp == a[i]) {
            }
        }

return rem;
    }
    }








