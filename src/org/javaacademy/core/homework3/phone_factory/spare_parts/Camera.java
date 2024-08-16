package org.javaacademy.core.homework3.phone_factory.spare_parts;

public class Camera {
    private final int numberOfPixels;

    public Camera(int numberOfPixels) {
        this.numberOfPixels = numberOfPixels;
    }

    public int getNumberOfPixels() {
        return numberOfPixels;
    }

    public void takesPhoto() {
        System.out.println("сделано фото");
    }

    @Override
    public String toString() {
        return "Camera{" +
                "numberOfPixels=" + numberOfPixels +
                '}';
    }
}
