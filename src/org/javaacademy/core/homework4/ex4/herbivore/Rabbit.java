package org.javaacademy.core.homework4.ex4.herbivore;

public class Rabbit extends Herbivore {
    //Кролик - умеет бегать (печать "кролик быстро бежит")
    public Rabbit(double weight) {
        super(weight);
    }

    @Override
    public void run() throws Exception {
        super.run();
        System.out.println("кролик быстро бежит");
    }
}
