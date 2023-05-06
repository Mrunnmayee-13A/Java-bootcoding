package com.bootcoding.java;

public class PrintPaper {
    int dimensions;
    double price;
    Double thickness;
    String brand;
    String type;

    public PrintPaper(){
        System.out.println("Paper is Printed");
    }

    public static void main(String[] args) {
        PrintPaper pp1 = new PrintPaper();
        PrintPaper pp2 = new PrintPaper();

        pp1.dimensions = 2*3;
        pp2.dimensions = 5*5;

        pp1.price = 8;
        pp2.price = 5;

        pp1.thickness = 0.2;
        pp2.thickness = 0.5;

        pp1.brand = "Classmate";
        pp2.brand ="Nova";

        pp1.type ="Xerox";
        pp2.type ="Photocopy";

        System.out.println("pp1.dimensions = "+pp1.dimensions);
        System.out.println("pp2.dimensions = "+pp2.dimensions);
        System.out.println("pp1.price = "+pp1.price);
        System.out.println("pp2.price= "+pp1.price);

    }
}

