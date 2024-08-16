package org.javaacademy.core.homework3.Immutable_city;
import java.util.Arrays;
public final class City {
    private final int ZERO = 0;
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
        House[] array = Arrays.copyOfRange(arrayHouses, ZERO, arrayHouses.length);
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
