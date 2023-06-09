package com.bootcoding.java.encapsulation;

import com.bootcoding.java.encapsulation.hospital.Hospital;
import com.bootcoding.java.encapsulation.patient.Patient;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class HospitalApp {
    public static void main(String[] args) {
        Patient ramesh = new Patient();
        ramesh.name ="Suresh";
        ramesh.dateOfAdmission = new Date();
        ramesh.dischargedate = getNextDate(3);
        ramesh.print();

        Hospital alexis = new Hospital();
        alexis.setName("Alexis");
        alexis.setAddress("Nagpur");
        alexis.setService("Multi-specialist Hospital");
        alexis.setId(UUID.randomUUID());

        System.out.println(alexis.getName());
        System.out.println(alexis.getAddress());
        System.out.println(alexis.getService());
        System.out.println(alexis.getId());

    }
    private static Date getNextDate(int days){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, days);
        System.out.println("Date ="+ cal.getTime());
        return cal.getTime();
    }
}
