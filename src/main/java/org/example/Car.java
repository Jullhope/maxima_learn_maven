package org.example;

public class Car extends MotorTransport {
    private String brand;
    private String model;

    public Car(int wheelCount, int maxSpeed, String engineType, String brand, String model) {
        super(wheelCount, maxSpeed, engineType);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void service() {
        super.service();
        System.out.println("Обслужено автомобиль марки \"" + brand + "\" модели \"" + model + "\"");
    }
}
