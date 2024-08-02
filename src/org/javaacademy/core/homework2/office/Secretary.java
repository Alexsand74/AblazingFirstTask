package org.javaacademy.core.homework2.office;

public class Secretary {
    void asksYouToCalmDown(Boss boss, Manager manager, SecurityGuard securityGuard) {
        System.out.println(boss.getName() + " не волнуйтесь, "
                + manager.getName() + " все успеет. "
                + securityGuard.getName() + " подождите!");
    }
}
