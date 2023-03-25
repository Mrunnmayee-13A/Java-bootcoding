package com.bootcoding.java.oops;

public class Mug {
    String type;
    String color;
    String brand;
    int capaity;
    String unit;

    public void print(){
        System.out.println(type);
        System.out.println(color);
        System.out.println(brand);
        System.out.println(capaity);
        System.out.println(unit);
    }
    public static void main(String[] args){
        Mug m1= new Mug();
        m1.type= "Plastic";
        m1.color="black";
        m1.brand= "cello";
        m1.capaity=1;
        m1.unit="litre";
        m1.print();
    }
}
