package org.javaacademy.core.homework3.phoneFactory.spareParts;

public class Frame {
    private final int width;
    private final int height;
    private final int length;

    public Frame(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Frame{" +
                "width=" + width +
                ", height=" + height +
                ", length=" + length +
                '}';
    }
}
