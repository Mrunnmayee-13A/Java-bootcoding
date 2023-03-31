package com.bootcoding.java.b106.assignment;

import java.awt.geom.Area;

public class AreaTriangle {
    public static void main(String[] args) {
        double b=11;
        double h=5;
       double ar= AreaTri(b,h);
        System.out.println("Area of triangle = "+ar);
    }
    public static double AreaTri(double b,double h){
        double res = (b*h)/2;
        return res;
    }
}
 