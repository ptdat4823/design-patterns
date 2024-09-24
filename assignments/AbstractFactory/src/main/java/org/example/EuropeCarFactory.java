package org.example;

public class EuropeCarFactory implements CarFactory {
    @Override
    public SedanCar createSedanCar() {
        return new SedanCar();
    }

    @Override
    public SUVCar createSUVCar() {
        return new SUVCar();
    }

    @Override
    public ElectricCar createElectricCar() {
        return new ElectricCar();
    }

}
