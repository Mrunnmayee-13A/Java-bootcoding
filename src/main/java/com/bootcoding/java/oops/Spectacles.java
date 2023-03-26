package com.bootcoding.java.oops;

public class Spectacles {
    String shape;
    double no;
    String thickness;
    String lens;

    public void print(){
        System.out.println(shape);
        System.out.println(no);
        System.out.println(thickness);
        System.out.println(lens);
    }
    public static void main(String[] args){
        Spectacles s1=new Spectacles();
        s1.shape= "hexagon";
        s1.no= 2.5;
        s1.thickness="broad";
        s1.lens="convex";
        s1.print();
    }
}
