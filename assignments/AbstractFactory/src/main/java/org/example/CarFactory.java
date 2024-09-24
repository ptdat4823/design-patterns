package org.example;

public interface CarFactory {
    public SedanCar createSedanCar();
    public SUVCar createSUVCar();
    public ElectricCar createElectricCar();
}
