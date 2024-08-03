package org.javaacademy.core.homework2.office;

public class Runner {
    public static void start() {
        Boss boss = new Boss("Петр Николаевич");
        Manager manager = new Manager("Володя");
        SecurityGuard securityGuard = new SecurityGuard("Петрович");
        Secretary secretary = new Secretary();
        Office office = new Office(boss, manager, secretary, securityGuard);
        office.workingDay();
    }
}
