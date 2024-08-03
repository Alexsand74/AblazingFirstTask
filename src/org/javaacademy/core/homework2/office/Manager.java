package org.javaacademy.core.homework2.office;

public class Manager {
    private String name;

    Manager(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void canScream() {
        System.out.println("Я ничего не успеваю, помогите!");
    }
}
