package org.javaacademy.core.homework4.ex3;

public class Driver implements Sounding {
//    Водитель умеет издавать звук: "Я водитель." (водитель является человеком,
//     но не использует его родительский метод)
    @Override
    public void sounding() {
        System.out.println("Я водитель.");
    }
}
