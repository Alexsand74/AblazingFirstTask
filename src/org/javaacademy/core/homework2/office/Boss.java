package org.javaacademy.core.homework2.office;

public class Boss {
    private String name;

    Boss(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void pushTheManager(Manager manager) {
        System.out.println(manager.getName() + " быстрее!");
    }
}
