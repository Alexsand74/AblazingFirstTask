package org.javaacademy.core.homework3.phoneFactory;

import org.javaacademy.core.homework3.phoneFactory.spareParts.Frame;

public class Samsung extends Telephone {
    public Samsung(int camera, int cpu, Frame frame) {
        super(camera, cpu, frame);
    }

    @Override
    public void takesPhoto() {
        System.out.print("Samsung ");
        super.takesPhoto();
    }

    @Override
    public String toString() {
        return "Samsung " + super.toString();
    }
}
