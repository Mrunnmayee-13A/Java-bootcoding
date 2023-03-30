package com.bootcoding.java.oops;

public class Shoe {
    String Brand;
    int Size;
    String Material;
    String Color;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String material) {
        Material = material;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "Brand='" + Brand + '\'' +
                ", Size=" + (String.format("%,.2f", Size)) +
                ", Material='" + Material + '\'' +
                ", Color='" + Color + '\'' +
                '}';
    }
}