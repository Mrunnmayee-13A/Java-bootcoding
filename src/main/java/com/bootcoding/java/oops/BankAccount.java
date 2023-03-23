package com.bootcoding.java.oops;

public class BankAccount {
    public static void main(String[] args) {
        int size = args.length;
        if (size < 2) {
            System.out.println("Invalid input!");
        } else {
            String Account = args[0];
            int money = Integer.parseInt(args[1]);
            if (money % 100 != 0) {
                System.out.println("Invalid input! Please provide input multiple of 100");
            }else
                if (Account.equals("Deposit")) {
                    int initamount = 500;
                    int Totamount = initamount + money;
                    System.out.println("Total amount balance= " + Totamount);

                } else if (Account.equals("CheckBalance")) {
                    int amount = 1000;
                    System.out.println("The balance is= " + amount);

                } else if (Account.equals("Withdraw")) {
                    int totamount = 1500;
                    int Withdrawalmoney = totamount - money;
                    System.out.println("Money after withdrawal= " + Withdrawalmoney);

                } else {
                    System.out.println("Invalid input! Valid input are Deposit CheckBalance Withdraw: ");
                }
            }
        }
    }

