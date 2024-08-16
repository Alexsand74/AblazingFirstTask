package org.javaacademy.core.homework3.phone_factory;

import org.javaacademy.core.homework3.phone_factory.spare_parts.Cpu;
import org.javaacademy.core.homework3.phone_factory.spare_parts.Camera;
import org.javaacademy.core.homework3.phone_factory.spare_parts.Frame;

public abstract class Telephone {
    private final Camera camera;
    private final Cpu cpu;
    private final Frame frame;

    protected Telephone(int camera, int cpu, Frame frame) {
        this.camera = new Camera(camera);
        this.cpu = new Cpu(cpu);
        this.frame = new Frame(frame);
    }

    protected Camera getCamera() {
        return camera;
    }

    protected Cpu getCpu() {
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
