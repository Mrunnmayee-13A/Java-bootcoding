package com.bootcoding.java.oops;

public class Bus {
    String color;
    String name;
    int number;
    int capacity;
    String type;


    public void print() {
        System.out.println(color);
        System.out.println(name);
        System.out.println(number);
        System.out.println(capacity);
        System.out.println(type);

        }
        public static void main(String[] args){
            Bus b1=new Bus();
            b1.color= "Yellow";
            b1.name= "MCCHS";
            b1.number= 34;
            b1.capacity=30;
            b1.type= "School Bus";
            b1.print();
    }

}
