package com.bootcoding.java.encapsulation.patient;

import java.util.Date;

public class Patient {
    private String disease;
    public String name;
    public Date dateOfAdmission;
    public Date dischargedate;

    public void print() {
        System.out.println("Name ="+ name);
        System.out.println("Date of Admission =" +dateOfAdmission);
        System.out.println("Date of discharge =" +dischargedate);
    }
}
