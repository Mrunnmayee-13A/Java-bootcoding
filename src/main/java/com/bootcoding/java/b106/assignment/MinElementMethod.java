package com.bootcoding.java.b106.assignment;

public class MinElementMethod {
    public static void main(String[] args) {
        int a[]={10, 2, 19,-34, 20, 0, 199};
        int res=0;
        res= findMin(a);
        System.out.println("The minimum element of array =" +res);
    }

    public static int findMin(int a[]){
        int min=a[0];
        for (int i=0; i<a.length; i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        return min;
    }
}
