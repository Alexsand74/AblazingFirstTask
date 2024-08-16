package org.javaacademy.core.homework3.phone_factory.spare_parts;

public class Cpu {
    private final int operatingFrequency;

    public Cpu(int operatingFrequency) {
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
