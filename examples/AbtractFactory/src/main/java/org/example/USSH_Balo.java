package org.example;

public class USSH_Balo implements Balo{

    int year;
    String color;
    public USSH_Balo(int year, String color) {
        this.year = year;
        this.color = color;
    }

    @Override
    public String getLogo() {
        return "USSH balo " + year;
    }

    @Override
    public String getColor() {
        return color;
    }
}
