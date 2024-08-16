package org.javaacademy.core.homework3.phone_factory.spare_parts;
public class Frame {
    private int width;
    private int height;
    private int length;
    public Frame(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    public Frame(Frame frame) {
        this(frame.getWidth(),frame.getHeight(),frame.getLength());
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
