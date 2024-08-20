package org.javaacademy.core.homework4.ex1.transport;

public class Bus extends Transport {
    private final int maxNumberPassengers;

    public Bus(double length, double height, double width) {
        super(length, height, width);
        this.maxNumberPassengers = 30;
    }

    public int getMaxNumberPassengers() {
        return maxNumberPassengers;
    }
}
