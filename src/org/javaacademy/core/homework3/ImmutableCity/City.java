package org.javaacademy.core.homework3.ImmutableCity;

import java.util.Arrays;

public final class City {
    private final String name;
    private final House[] arrayHouses;

    public City(String name, House[] arrayHouses) {
        this.name = name;
        this.arrayHouses = arrayHouses;
    }

    public String getName() {
        String nameCity = this.name;
        return nameCity;
    }

    public House[] getHouses() {
        House[] array = new House[arrayHouses.length];
        for (int i = 0; i < arrayHouses.length; i++) {
            array[i] = new House(arrayHouses[i].getName(),arrayHouses[i].getNumber());
        }
        return array;
    }

    @Override
    public String toString() {
        return "City{" +
                "name: " + name + '\'' +
                ", arrayHouses: " + Arrays.toString(arrayHouses) +
                '}';
    }
}
