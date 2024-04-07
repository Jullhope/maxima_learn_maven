package org.example;

public class ServiceStation {
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
}
