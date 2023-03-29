package com.bootcoding.java.oops;

public class Door {
    double dimensions;
    String unit;
    String type;
    String brand;

    public void  print(){
        System.out.println(dimensions);
        System.out.println(unit);
        System.out.println(type);
        System.out.println(brand);
    }
    public static void main(String args[]){
        Door d1=new Door();
        d1.dimensions= 5;
        d1.unit= "meter";
        d1.type= "wooden";
        d1.brand = "Godrej";
        d1.print();
    }
}
