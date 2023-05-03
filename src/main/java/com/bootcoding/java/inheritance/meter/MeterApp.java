package com.bootcoding.java.inheritance.meter;

public class MeterApp {
    public static void main(String[] args) {
        SinglePhaseMeter sp = new SinglePhaseMeter();
        ThreePhaseMeter tp = new ThreePhaseMeter();
        System.out.println("Properties of Single-Phase Meter are -");
        sp.type = "Single Phase Meter";
        sp.voltage = 240.00;
        sp.print();
        System.out.println("Properties of Three-Phase Meter are -");
        tp.voltage = 240.00;
        tp.type= "Three-Phase Meter";
        tp.print();
    }
}
