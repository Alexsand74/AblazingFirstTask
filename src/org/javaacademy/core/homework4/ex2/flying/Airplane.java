package org.javaacademy.core.homework4.ex2.flying;

import org.javaacademy.core.homework4.ex2.exception.FlyException;

public class Airplane implements Flying {
//     Для самолета:
//     Метод летать будет выкидывать ошибку FlyException, если количество пассажиров меньше нуля.
//     Иначе печать "самолет летит"
    private static final int ZERO = 0;
    private final int countPassengers;

    public Airplane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() throws FlyException {
        if (countPassengers < ZERO) {
            throw new FlyException("пассажиров в самолете меньше 0");
        }
        System.out.println("самолет летит");
    }
}
