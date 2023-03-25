package com.bootcoding.java.oops;

public class Discount {
   public int getCustomerDiscount(String Customertype){
       return switch (Customertype) {
           case "Regular" -> 40;
           case "Premium" -> 50;
           case "NonRegular" -> 10;
           default -> 0;
       };
   }
}
