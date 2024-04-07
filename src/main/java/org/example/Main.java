package org.example;

import java.util.Scanner;

public class Main {
    public static void visitServiceStation(WheeledTransport transport) {
        transport.service();

        if (transport instanceof Car) {
            Car ford = (Car) transport;
            ford.gasOn();
        } else if (transport instanceof Truck) {
            Truck gruzovik = (Truck) transport;
            gruzovik.carryCargo();
        } else if (transport instanceof Bicycle) {
            Bicycle velo = (Bicycle) transport;
            velo.pedal();
        }
    }
    public static void main(String[] args) {
//        Bicycle bicycle = new Bicycle(2, 20, "Городской");
//        Car car = new Car(4, 180, "Бензиновый", "Toyota", "Corolla");
//        Truck truck = new Truck(6, 100, "Электро", 10.0);
//
//        visitServiceStation(bicycle);
//        visitServiceStation(car);
//        visitServiceStation(truck);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите тип транспортного средства (Bicycle, Car, Truck):");
        String vehicleType = scanner.nextLine();

        WheeledTransport transport;

        if (vehicleType.equalsIgnoreCase("car")) {
            transport = new Car(4, 170, "Бензиновый", "Ford", "Focus" );
        } else if (vehicleType.equalsIgnoreCase("truck")) {
            transport = new Truck(6, 120, "Дизельный", 20.0);
        } else if (vehicleType.equalsIgnoreCase("bicycle")){
            transport = new Bicycle(2, 40, "Горный");
        } else {
            System.out.println("Неверный тип транспортного средства!");
            return;
        }

        visitServiceStation(transport);




    }

}