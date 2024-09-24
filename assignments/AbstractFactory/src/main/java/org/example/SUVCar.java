package org.example;

public class SUVCar implements Car{
    @Override
    public String getEngine() {
        return "SUV Engine";
    }

    @Override
    public Integer getSeat() {
        return 4;
    }

    @Override
    public String getSize() {
        return "SUV Size";
    }
}
