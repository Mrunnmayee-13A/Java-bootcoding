package com.bootcoding.java.b106.assignment;

public class HarmonicSeries {
    public static void main(String[] args) {
        double hs =0;
        for (int i=1; i<=5; i++){
            hs= (1/i)+(1/1+i) ;
        }
        System.out.println("The sum of Harmonic Series = " +hs);
    }
}
