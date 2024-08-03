package org.javaacademy.core.homework2.office;

public class Office {
    Boss boss;
    Manager manager;
    Secretary secretary;
    SecurityGuard securityGuard;

    Office(Boss boss, Manager manager, Secretary secretary, SecurityGuard securityGuard) {
        this.boss = boss;
        this.manager = manager;
        this.secretary = secretary;
        this.securityGuard = securityGuard;
    }

    void workingDay() {
        boss.pushTheManager(manager);
        manager.canScream();
        securityGuard.giveMeAnAdvance();
        secretary.asksYouToCalmDown(boss, manager, securityGuard);
    }
}
