package org.javaacademy.core.homework4.ex3;

public class Builder extends Human {
//    Строитель умеет издавать звук: "Я строитель." + звук из человека
    @Override
    public void sounding() {
        super.sounding();
        System.out.println("Я строитель.");
    }
}
