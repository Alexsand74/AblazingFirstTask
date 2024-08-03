package org.javaacademy.core.homework2.office;

public class SecurityGuard {
    private String name;

    SecurityGuard(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void giveMeAnAdvance() {
        System.out.println("Прошу выдать, мне аванс ?");
    }
}
