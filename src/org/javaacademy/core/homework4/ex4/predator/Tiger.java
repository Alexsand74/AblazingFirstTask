package org.javaacademy.core.homework4.ex4.predator;

public class Tiger extends Predator {
    //Тигр умеет нападать на живое, но за счет ловкости может съесть жертву весом до двух раз больше него.
    //Остальные условия такие же как при нападении хищника.
    private static final int PROPERTY_TIGER = 2;

    public Tiger(double weight) {
        super(PROPERTY_TIGER * weight);
    }
}
