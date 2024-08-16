package org.javaacademy.core;
import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

class Run {
    public static void main(String[] args) {
        HashMap<String,Cat> map = new HashMap<>();
        String[] strings = {"A", "B", "C", "D", "E", "F"};
        for (String el : strings){
            Cat cat = new Cat(el);
            map.put(el, cat);
        }
        map.entrySet().forEach(System.out::println);
    }
}
class Cat{
    String name;
    Cat(String name){ this.name = name;}
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}