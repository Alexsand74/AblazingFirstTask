package org.javaacademy.core.homework3.shop;

/**
 * Покупатель
 */
class Customer {
    private String name;

    Customer(String name) {
        this.name = name;
    }

    void checkShop(Shop shop) {
        //ПОМЕНЯТЬ ЗДЕСЬ ВЫРАЖЕНИЕ
        boolean checkConditionOne = shop.isClearFloor()
                && shop.isWorkersHasBadge() && (shop.getCountWorkers() > 2);
        boolean checkConditionTwo = !shop.isClearFloor()
                && shop.isWorkersHasBadge() && (shop.getCountWorkers() > 2);
        boolean checkConditionThree = shop.isClearFloor()
                && !shop.isWorkersHasBadge() && (shop.getCountWorkers() > 2);
        boolean checkConditionFour = shop.isClearFloor() && shop.isWorkersHasBadge()
                && !(shop.getCountWorkers() > 2);
        if (checkConditionOne
                || checkConditionTwo
                || checkConditionThree
                || checkConditionFour) {
            System.out.println(name + ": Магазин прошел проверку");
        } else {
            System.out.println(name + ": Магазин не прошел проверку!");
        }
    }
}

