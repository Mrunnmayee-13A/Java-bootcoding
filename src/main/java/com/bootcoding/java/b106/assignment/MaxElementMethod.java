package com.bootcoding.java.b106.assignment;

public class MaxElementMethod {
    public static void main(String[] args) {
        int a[] = {10, 2, 19, 20, 0, 199};
        int res=0;
        res= findMaxElement(a);
        System.out.println("The maximum element of array is " +res);
    }
    public static int findMaxElement(int a[]){
        int max=0;
        for (int i=0; i<a.length; i++){
            if (max<a[i]){
                max=a[i];
            }
        }
        return max;
    }
}
