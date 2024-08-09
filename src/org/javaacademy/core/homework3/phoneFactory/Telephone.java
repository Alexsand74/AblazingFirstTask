package org.javaacademy.core.homework3.phoneFactory;

import org.javaacademy.core.homework3.phoneFactory.spareParts.CPU;
import org.javaacademy.core.homework3.phoneFactory.spareParts.Camera;
import org.javaacademy.core.homework3.phoneFactory.spareParts.Frame;

public abstract class Telephone {
    private final Camera camera;
    private final CPU cpu;
    private final Frame frame;

    protected Telephone(int camera, int cpu, Frame frame) {
        this.camera = new Camera(camera);
        this.cpu = new CPU(cpu);
        this.frame = frame;
    }

    protected Camera getCamera() {
        return camera;
    }

    protected CPU getCpu() {
        return cpu;
    }

    protected Frame getFrame() {
        return frame;
    }

    protected void takesPhoto() {
        this.camera.takesPhoto();
    }

    @Override
    public String toString() {
        return "{" +
                "camera = " + camera +
                ", cpu = " + cpu +
                ", frame = " + frame +
                '}';
    }
}
