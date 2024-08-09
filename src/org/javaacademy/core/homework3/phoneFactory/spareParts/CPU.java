package org.javaacademy.core.homework3.phoneFactory.spareParts;

public class CPU {
    private final int operatingFrequency;

    public CPU(int operatingFrequency) {
        this.operatingFrequency = operatingFrequency;
    }

    public int getOperatingFrequency() {
        return operatingFrequency;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "operatingFrequency=" + operatingFrequency +
                '}';
    }
}
