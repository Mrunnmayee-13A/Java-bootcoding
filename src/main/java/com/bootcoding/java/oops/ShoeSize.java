package com.bootcoding.java.oops;

public class ShoeSize {
    public static void main(String[] args) {


        Shoe[] sh= new Shoe[3];
        sh[0]=new Shoe();
        sh[1]=new Shoe();
        sh[2]=new Shoe();
        sh[0].Brand= "Bata";
        sh[0].Size= 7;
        sh[0].Color= "Black";
        sh[0].Material="Leather";
        sh[1].Brand= "Paragon";
        sh[1].Size= 8;
        sh[1].Color= "Brown";
        sh[1].Material="Leather";
        sh[2].Brand= "Bata";
        sh[2].Size= 8;
        sh[2].Color= "White";
        sh[2].Material="Leather";

        for(int i=0; i<sh.length; i++){
            if(sh[i].Size==8){
                System.out.println(sh[i]);
            }
        }

        }
    }

