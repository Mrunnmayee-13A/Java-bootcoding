package com.bootcoding.java.oops;

import java.sql.SQLOutput;

public class Student {
    public static void main(String[] args) {
        int size = args.length;
        if (size < 4) {
            System.out.println("Please provide valid input!");
        } else {
            String operation = args[0];
            int marks1 = Integer.parseInt(args[1]);
            int marks2 = Integer.parseInt(args[2]);
            int marks3 = Integer.parseInt(args[3]);

            if (operation.equals("avg")) {
                int sum = marks1 + marks2 + marks3;
                double avg = sum / 3.0;
                System.out.println("Average= " + avg);
            } else if (operation.equals("percentage")) {
                int sum = marks1 + marks2 + marks3;
                double percentage = sum / 300.00 * 100;
                System.out.println("Percentage= " + percentage);
            } else {
                System.out.println("Invalid input! Valid input are avg or percentage");
            }
        }
    }
}
