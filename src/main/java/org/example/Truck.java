package org.example;

public class Truck extends MotorTransport {
    private double cargoCapacity;

    public Truck(int wheelCount, int maxSpeed, String engineType, double cargoCapacity) {
        super(wheelCount, maxSpeed, engineType);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void service() {
        super.service();
        System.out.println("Обслужено грузовое транспортное средство с грузоподъемностью " + cargoCapacity + " тонн");
    }
}