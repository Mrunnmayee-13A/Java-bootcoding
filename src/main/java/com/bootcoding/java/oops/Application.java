package com.bootcoding.java.oops;

public class Application {
    public static void main(String[] args)
    {
        Customer ramesh=new Customer();
        ramesh.type="Regular";
        ramesh.name="Ramesh";
        Customer suresh=new Customer();
        suresh.type="NonRegular";
        suresh.name="Suresh";
        Customer ganesh=new Customer();
        ganesh.name="Ganesh";
        ganesh.type="Premium";

        Discount discount=new Discount();
        int rameshDiscount= discount.getCustomerDiscount(ramesh.type);
        int sureshDiscount= discount.getCustomerDiscount(suresh.type);
        int ganeshDiscount= discount.getCustomerDiscount(ganesh.type);

        System.out.println("Ramesh is a "+ramesh.type + " customer" +" and got discount " + rameshDiscount+ "%");
        System.out.println("Suresh is a "+suresh.type+ " customer" +" and got discount "+ sureshDiscount+ "%");
        System.out.println("Ganesh is a "+ganesh.type+ "customer" +" and got discount "+ ganeshDiscount+ "%");
    }
}
