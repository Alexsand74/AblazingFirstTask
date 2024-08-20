package org.javaacademy.core.homework4.ex2.exception;

public class FlyException extends Exception {
//         Метод летать будет выкидывать ошибку FlyException (создать такой класс), если утка подстрелена,
    public FlyException(String message) {
        super(message);
    }
}
