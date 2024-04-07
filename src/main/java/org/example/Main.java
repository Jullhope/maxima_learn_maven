package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Car car1 = new Car(4, 200, "Бензиновый", "Toyota", "Corolla");
//        Car car2 = new Car(4, 220, "Бензиновый", "Ford", "Focus");
//        Bicycle bicycle1 = new Bicycle(2, 40, "Горный");
//        Bicycle bicycle2 = new Bicycle(2, 30, "Городской");
//        Truck truck1 = new Truck(6, 140, "Дизельный", 10.5);
//        Truck truck2 = new Truck(6, 130, "Дизельный", 20.0);
        WheeledTransport[] transports = {
        new Car(4, 200, "Бензиновый", "Toyota", "Corolla"),
        new Bicycle(2, 40, "Горный"),
        new Bicycle(2, 30, "Городской"),
        new Car(4, 220, "Бензиновый", "Ford", "Focus"),
        new Truck(6, 130, "Дизельный", 20.0),
        new Truck(6, 140, "Дизельный", 10.5),
    };
        ServiceStation serviceStation = new ServiceStation();

        for (WheeledTransport transport : transports) {
            serviceStation.visitServiceStation(transport);
        }
    }

}