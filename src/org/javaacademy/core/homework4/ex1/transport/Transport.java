package org.javaacademy.core.homework4.ex1.transport;

public abstract class Transport {
    private boolean clean; // чистоe транспортное средство = true, грязное = false
    private final double width;
    private final double height;
    private final double length;

    //В автомойку были отправлены грязные машины мэрии: 4 легковых(длина высота ширина) (5х2х1.8),
    //5 автобусов(12х3х2.3) <-- поэтому сразу создаем транспорт грязным
    public Transport(double length, double height, double width) {
        this.clean = false;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

}
