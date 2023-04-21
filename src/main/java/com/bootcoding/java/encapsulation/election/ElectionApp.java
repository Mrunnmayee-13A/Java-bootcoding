package com.bootcoding.java.encapsulation.election;

import java.util.Calendar;
import java.util.Date;

public class ElectionApp {
    public static void main(String[] args) {
        Candidate can = new Candidate();
        can.setName("Ram Shah");
        can.setQualification("MTech in CSE");
        can.setIncome(9000000.00);
        can.setPartyname("XYZ Party");
        can.setSymbol("Lotus");

        System.out.println(can.getName());
        System.out.println(can.getQualification());
        System.out.println(can.getIncome());
        System.out.println(can.getPartyname());
        System.out.println(can.getSymbol());

         Election elect = new Election();
         elect.setEligibility("Post Graduated");
         elect.setElectionDate(getDate(6));
         elect.setDateOfElectionResult(getDate(20));
    }
    private static Date getDate(int days) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, days);
        System.out.println("Date =" + cal.getTime());
        return cal.getTime();
    }
}
