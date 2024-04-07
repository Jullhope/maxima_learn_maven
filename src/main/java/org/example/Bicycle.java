package org.example;

public final class Bicycle extends WheeledTransport {
    private String type;

    public Bicycle(int wheelCount, int maxSpeed, String type) {
        super(wheelCount, maxSpeed);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public final void pedal() {
        System.out.println("\nКрути педали!");
    }

    @Override
    public void service() {
        super.service();
        serveBicycle();
    }

    private void serveBicycle() {
        System.out.println("Обслужено навесное оборудование велосипеда типа \"" + type + "\"");
    }
}
