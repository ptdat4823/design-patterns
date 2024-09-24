package org.example;

public class SedanCar implements Car{

    @Override
    public String getEngine() {
        return "Sedan Engine";
    }

    @Override
    public Integer getSeat() {
        return 6;
    }

    @Override
    public String getSize() {
        return "Sedan Size";
    }
}
