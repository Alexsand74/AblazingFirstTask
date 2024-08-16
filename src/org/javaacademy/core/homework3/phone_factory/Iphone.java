package org.javaacademy.core.homework3.phone_factory;

import org.javaacademy.core.homework3.phone_factory.spare_parts.Cpu;
import org.javaacademy.core.homework3.phone_factory.spare_parts.Frame;

public class Iphone extends Telephone {
    private final Cpu cpuTwo;

    public Iphone(int camera, int cpu, int cpuTwo, Frame frame) {
        super(camera, cpu, frame);
        this.cpuTwo = new Cpu(cpuTwo);
    }

    @Override
    public void takesPhoto() {
        System.out.print("Iphone ");
        super.takesPhoto();
    }

    public void processorInformation() {
        System.out.println("processor one frequency = " + super.getCpu().getOperatingFrequency() + " Mhz, "
                + "processor two frequency = " + this.cpuTwo.getOperatingFrequency() + " Mhz.");
    }

    @Override
    public String toString() {
        return "Iphone {" +
                "camera = " + super.getCamera() +
                ", cpu = " + super.getCpu() +
                " cpuTwo = " + cpuTwo +
                ", frame = " + super.getFrame() +
                '}';
    }
}