package com.bootcoding.java.inheritance.banner;

public class BannerApp {
    public static void main(String[] args) {

        FlexBanner fb = new FlexBanner();

        fb.matter =" New batches of java Boot-coding is starting soon";
        fb.type = " Flex Banner";
        fb.create();
        fb.display();
    }
}
