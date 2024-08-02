package org.javaacademy.core.homework2.office;

public class Manager {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void canScream() {
        System.out.println("Я ничего не успеваю, помогите!");
    }
}
