package org.javaacademy.core.homework3.shop;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        //Задача: Тайный клуб покупателей
        //Сделать, рефакторинг кода (т.е изменить код), таким образом, чтобы:
        //1. Магазин мог создаваться во всех классах любых пакетов
        //2. Атрибуты магазина и покупателя соответствовали правилам инкапсуляции
        //3. Сделать так, чтобы покупатель имел имя
        //4. Изменить метод Customer.checkShop так, чтобы при проверке магазина,
        //соблюдение двух из 3 условий свидетельствовали об успешном прохождении проверки:
        //- Пол чистый
        //- У работников есть бейджики
        //- Количество работников больше 2

        //Проверить здесь правильность написанного кода, создав покупателя, магазин и запустив проверку от покупателя

        Customer customer = new Customer("Иван");
        Shop[] arrayShops = {new Shop(true, true, 3),
                new Shop(false, true, 3),
                new Shop(true, false, 3),
                new Shop(true, true, 2),

                new Shop(true, false, 2),
                new Shop(false, true, 2),
                new Shop(false, false, 3),
                new Shop(false, false, 2)
        };
        for (Shop shop : arrayShops) {
            customer.checkShop(shop);
        }
        System.out.println("-------------------------------------");
        Arrays.stream(arrayShops).forEach(customer::checkShop);
    }
}
