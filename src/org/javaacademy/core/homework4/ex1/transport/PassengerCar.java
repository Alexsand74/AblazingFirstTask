package org.javaacademy.core.homework4.ex1.transport;

public class PassengerCar extends Transport {

    private final boolean cruiseControl;

    public PassengerCar(double length, double height, double width) {
        super(length, height, width);
        this.cruiseControl = true;
    }

    public boolean isCruiseControl() {
        return cruiseControl;
    }
}
