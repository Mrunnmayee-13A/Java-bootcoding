package com.bootcoding.java.b106.assignment;

public class PositiveNumSum {
    public static void main(String[] args) {
        int a[] = {1, 5, -3, 2, 11};
        int res = PositiveNoSum(a);
        System.out.println("The sum of positive no. in the array is = " + res);
    }

    public static int PositiveNoSum(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0)
                sum = a[i] + sum;
        }
        return sum;
    }
}
