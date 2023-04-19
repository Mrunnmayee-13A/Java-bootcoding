package com.bootcoding.java;

public class Switch {
    String brand;
    int number;
    String color;
    int sockets;
    String material;

    public Switch (){
        System.out.println("Switch is created");
    }

    public static void main(String[] args) {
        Switch sw1 = new Switch();
        Switch sw2 = new Switch();
        sw1.brand = "Phillipes";
        sw2.brand ="Syska";
        sw1.number = 5;
        sw2.number = 6;
        sw1.color = "White";
        sw2.color ="Grey";
        sw1.sockets = 2;

        System.out.println(sw1.brand);

    }

}
