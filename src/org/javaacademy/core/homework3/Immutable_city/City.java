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
//        House[] copied = Arrays.stream(arrayHouses)
//                .map(o -> new House(o.getName(), o.getNumber()))
//                .toArray(House[]::new);  // Создаем новый массив объектов

        int number;
        House[] copied = new House[arrayHouses.length];
        StringBuffer street = new StringBuffer();
        for (int i = ZERO; i < arrayHouses.length; i++){
            number = arrayHouses[i].getNumber();
            street.append(arrayHouses[i].getName());
            copied[i] = new House(street.toString(),number);
            street.delete(ZERO, street.length());
        }
    return copied;
    }
    @Override
    public String toString() {
        return "City{" +
                "name: " + name + '\'' +
                ", arrayHouses: " + Arrays.toString(arrayHouses) +
                '}';
    }
}
