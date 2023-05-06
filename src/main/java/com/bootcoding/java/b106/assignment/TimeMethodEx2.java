package com.bootcoding.java.b106.assignment;

public class TimeMethodEx2 {
        public static void main(String[] args) {
            int n= 2;
            int con = MinintoSec(n);
            System.out.println("2 min = "+con+" sec");
        }
        public static int MinintoSec(int n){
            int sec= n*60;
            return sec;
        }
    }


