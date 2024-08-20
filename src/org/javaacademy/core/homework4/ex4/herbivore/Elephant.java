package org.javaacademy.core.homework4.ex4.herbivore;

public class Elephant extends Herbivore {
    //Слон - умеет бегать (печать "слон медленно бежит")
    public Elephant(double weight) {
        super(weight);
    }

    @Override
    public void run() throws Exception {
        super.run();
        System.out.println("слон медленно бежит");
    }
}
