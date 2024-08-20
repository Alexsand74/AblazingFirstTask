package org.javaacademy.core.homework4.ex2.flying;

import org.javaacademy.core.homework4.ex2.exception.FlyException;

public class Duck implements Flying {
//     Для утки:
//     Метод летать будет выкидывать ошибку FlyException (создать такой класс), если утка подстрелена,
//     иначе печатать на экран "утка летит"
    private final boolean isInjured; // если true - ранен, false - не ранен

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    @Override
    public void fly() throws FlyException {
        if (isInjured) {
            throw new FlyException("утка ранена");
        }
        System.out.println("утка летит");
    }
}
