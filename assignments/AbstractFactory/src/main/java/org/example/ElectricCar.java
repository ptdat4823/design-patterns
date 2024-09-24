package org.example;

public class ElectricCar implements Car {
    @Override
    public String getEngine() {
        return "Electric Engine";
    }

    @Override
    public Integer getSeat() {
        return 4;
    }

    @Override
    public String getSize() {
        return "Electric Size";
    }
}
