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
        s1.shape= "octane";
        s1.no= 0.5;
        s1.thickness="thin";
        s1.lens="concave";
        s1.print();
    }
}
