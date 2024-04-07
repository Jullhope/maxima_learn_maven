package org.example;

public class Main {
    public static void visitServiceStation(WheeledTransport transport) {
        transport.service();
    }
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(2, 20, "Горный");
        Car car = new Car(4, 180, "Бензиновый", "Toyota", "Corolla");
        Truck truck = new Truck(6, 100, "Электро", 10.0);

        visitServiceStation(bicycle);
        visitServiceStation(car);
        visitServiceStation(truck);
    }

}