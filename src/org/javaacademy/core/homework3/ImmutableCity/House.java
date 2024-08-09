package org.javaacademy.core.homework3.ImmutableCity;
public class House {
    private String name;
    private int number;

    public House(String name, int houseNumber) {
        this.name = name;
        this.number = houseNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "House{" +
                "street: " + name +
                ", house: " + number +
                '}';
    }
}

