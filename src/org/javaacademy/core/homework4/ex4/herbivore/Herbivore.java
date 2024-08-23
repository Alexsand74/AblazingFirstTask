package org.javaacademy.core.homework4.ex4.herbivore;

import org.javaacademy.core.homework4.ex4.Live;

public abstract class Herbivore extends Live {
    //Травоядное - умеет бегать (не определено как).
    // Но все травоядные могут бегать только в состоянии живое.
    //Иначе выдает ошибку - "Животное не может бегать".
    public Herbivore(double weight) {
        super(weight);
    }

    public void run() throws Exception {
        if (!this.isLife()) {
            throw new Exception("Животное не может бегать");
        }
    }
}
