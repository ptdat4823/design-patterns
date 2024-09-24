package org.example;

public class UIT_Balo implements Balo {
    public int year;
    public String color;
    public UIT_Balo(int year, String color) {
        this.year = year;
        this.color = color;
    }

    @Override
    public String getLogo() {
        return "UIT balo " + year;
    }

    @Override
    public String getColor() {
        return color;
    }

}
