package org.javaacademy.core.homework4.ex4;

public abstract class Live {
//    Живое - обладает свойством жив/мертв, вес. Умеет умирать - переход в состояние мертв.
    private double weight;
    private boolean life; // true - жив, false - мертв

    public Live(double weight) {
        this.weight = weight;
        this.life = true;
    }

    public double getWeight() {
        return weight;
    }

    protected void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isLife() {
        return life;
    }

    public void dies() {
        this.life = false;
    }
}
