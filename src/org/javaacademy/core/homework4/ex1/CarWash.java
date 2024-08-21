package org.javaacademy.core.homework4.ex1;

import org.javaacademy.core.homework4.ex1.transport.Transport;

public class CarWash {
    //Создать автомойку
    //Автомойка умеет мыть машину. Делает машину чистой. Возвращает стоимость помывки.
    //Автомойка умеет мыть машины. Делает машины чистыми. Возвращает стоимость помывки за все машины.
    //Категории автомобилей:
    //если длина > 6 или высота > 2.5 метра или ширина > 2, то машина считается крупной,
    //иначе считается маломерной.
    //Тариф 4000 - для крупных авто.
    //Тариф 2000 - для маломерных.
    private static final int SMALL_PRICES = 2000;
    private static final int BIG_PRICES = 4000;
    private static final double LENGTH = 6;
    private static final double HEIGHT = 2.5;
    private static final double WIDTH = 2;
    private static final int COUNT_SUCCESS_RULES = 1;

    public int clean(Transport transport) {
        transport.setClean(true);
        return calculationPrices(transport);
    }

    public int calculationPrices(Transport transport) {
        int countSuccessRules = 0; // колличество успешно пройденные условий
        countSuccessRules += transport.getHeight() > HEIGHT ? 1 : 0;
        countSuccessRules += transport.getLength() > LENGTH ? 1 : 0;
        countSuccessRules += transport.getWidth() > WIDTH ? 1 : 0;
        if (countSuccessRules >= COUNT_SUCCESS_RULES) {
            return BIG_PRICES;
        }
        return SMALL_PRICES;
    }

    public int cleanTransports(Transport... transports) {
        int costWashing = 0;
        for (Transport transport : transports) {
            costWashing += clean(transport);
        }
        return costWashing;
    }
}
