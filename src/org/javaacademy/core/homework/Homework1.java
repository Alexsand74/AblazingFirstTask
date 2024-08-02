package org.javaacademy.core.homework;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Homework1 {
    public static void main(String[] args) {
        ex2();
        System.out.println("___________________________________________");
        ex3();
        System.out.println("___________________________________________");
        ex4();
        System.out.println("___________________________________________");
        advanced();
    }

    public static void ex1() {
        //Открыть класс Calc, там задание!
    }

    public static void ex2() {
        //Дана строка
        String name = "     ПЕтРов Олег Иванович     ";
        //Необходимо
        //1. убрать лишние пробелы,
        //2. перевести текст в верхний регистр
        //3. Если содержит "ова " то печатаем на экран: Уважаемая {name}
        // Если содержит "ов " то печатаем на экран: Уважаемый {name}
        // В иных случаях печатаем на экран: Неизвестное лицо {name}
        name = name.trim().toUpperCase();
        String[] arrayWords = name.split(" ");
        String surname = arrayWords[0];
        String conditionOne = "ова ".trim().toUpperCase();
        String conditionTwo = "ов ".trim().toUpperCase();
        if (surname.contains(conditionOne)) {
            System.out.println("Уважаемая " + name);
        } else if (surname.contains(conditionTwo)) {
            System.out.println("Уважаемый " + name);
        } else {
            System.out.println("Неизвестное лицо " + name);
        }
    }

    public static void ex3() {
        //У нас есть машина. В данной машине есть перечень проверок, перед запуском двигателя
        //Количество топлива
        double fuel = 10;
        //Работоспособен или нет двигатель
        boolean isEngineWork = true;
        //Есть ли ошибки в компьютере (false - ошибок нет)
        boolean hasErrors = false;
        //Датчики давления шин
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        //Поменять(убрать, поставить) логические операторы так, чтобы машина запускалась:
        // когда топлива не меньше 10 литров, двигатель работает, колеса работают, нет ошибок
        //В ином случае, машина не должна запускаться
        if (
                fuel >= 10
                        && (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4)
                        && !hasErrors
                        && isEngineWork
        ) {
            System.out.println("Машина едет");
        } else {
            System.out.println("Машина не едет");
        }
    }

    public static void ex4() {
        //Работа на самостоятельное изучение функций класса String.
        //Заменить в строке 'this is' на 'those are',
        //получить индекс (число) второй буквы 'o' в строке. ПОЛУЧЕНИЕ ИНДЕКСА ЧЕРЕЗ ФУНКЦИЮ!
        //Распечатать полученный индекс
        String simply = "this is simply. This is my favorite song.";
        String lookingSubstring = "this is";
        String replaceSubstring = "those are";
        String result = simply.replaceAll(lookingSubstring, replaceSubstring);
        System.out.println(result);
        int secondLetter = result.indexOf('o', result.indexOf('o') + 1);
        System.out.println(secondLetter);
    }

    /**
     * Для продвинутых!
     * Принимается только при использовании класса BigDecimal в расчетах.
     */
    public static void advanced() {
        //Задача №4
        //Компания Рога и Копыта производит мясные продукты.
        //Перечень производимых товаров :
        //Колбаса - стоимость(цена) 800 руб,
        //себестоимость при производстве меньше 1000 кг - 412руб,
        //себестоимость при производстве от 1000 до 2000 (не включая) - 408 руб
        //себестоимость при производстве от 2000 - 404 руб

        //Ветчина - стоимость 350 руб
        //себестоимость при производстве - 275 руб

        //Шейка - стоимость 500 руб
        //себестоимость при производстве меньше 500кг - 311 руб
        //себестоимость при производстве больше или равно 500кг - 299 руб

        //Финансовые показатели
        //Доход компании считается как умножение стоимости на количество проданных кг
        //Расход компании считается как умножение себестоимости на количество проданных кг + миллион рублей
        //Прибыль до налогов считается как: доход - расход
        //Налоги считаются так:
        // прибыль до налогов больше 2_000_000, облагается ставкой 13%
        // прибыль до налогов больше 1_000_000 до 2_000_000, облагается ставкой 10%
        // прибыль до налогов до 1_000_000 (включительно), облагается ставкой 8%
        //пример расчета налогов для прибыли до налогов 2_500_000:
        //1_000_000 - налог 80_000 - по ставке 8%
        //1_000_000 - налог 100_000 - по ставке 10%
        //500_000 - 65_000 - по ставке 13%
        //Итоговый налог: 80_000 + 100_000 + 65_000 = 245_000
        //Прибыль после налогов: прибыль до налогов - налог.

        //Необходимо создать универсальную систему расчетов прибыли после налогов,
        //Т.е на вход подаются данные по количеству произведенных продуктов
        // и печатается прибыль после налогов компании
        //Узнать прибыль после налогов, при продаже:
        //Колбасы 2000кг - это произведено и продано
        //Ветчины 8511кг - это произведено и продано
        //Шейки 6988кг - это произведено и продано

        BigDecimal sellingPriceOfSausage = BigDecimal.valueOf(800.0);
        BigDecimal costOfSausageProductionIsLess1000kg = BigDecimal.valueOf(412.0);
        BigDecimal costOfSausageProductionIsFrom1000to2000 = BigDecimal.valueOf(408.0);
        BigDecimal costOfSausageProductionIsFrom2000 = BigDecimal.valueOf(404.0);

        BigDecimal sellingPriceOfHam = BigDecimal.valueOf(350.0);
        BigDecimal costOfHamInProduction = BigDecimal.valueOf(275.0);

        BigDecimal neckSalePrice = BigDecimal.valueOf(500.0);
        BigDecimal costOfNeckDuringProductionIsLess500kg= BigDecimal.valueOf(311.0);
        BigDecimal costOfNeckDuringProductionIsGreaterThanOrEqualTo500kg = BigDecimal.valueOf(299.0);

        BigDecimal quantityOfSausageSoldInKg = BigDecimal.valueOf(2000.0);
        BigDecimal quantityOfHamSoldInKg = BigDecimal.valueOf(8511.0);
        BigDecimal quantityOfNeckSoldInKg = BigDecimal.valueOf(6988.0);

        //считаем полную сумму от проданного продукта за все проданные килограммы
        BigDecimal amountOfMoneyFromSaleOfSausage = sellingPriceOfSausage.multiply(quantityOfSausageSoldInKg);
        BigDecimal amountOfMoneyFromSaleOfHam = sellingPriceOfHam.multiply(quantityOfHamSoldInKg);
        BigDecimal amountOfMoneyFromSaleOfNeck = neckSalePrice.multiply(quantityOfNeckSoldInKg);

        //считаем прибыль по колбасе до налогов
        BigDecimal profitBeforeTaxesSausages = new BigDecimal(0.0);
        if (quantityOfSausageSoldInKg.compareTo(new BigDecimal(1000.0)) < 0 ) {
            profitBeforeTaxesSausages = costOfSausageProductionIsLess1000kg.multiply(quantityOfSausageSoldInKg);
        } else if (quantityOfSausageSoldInKg.compareTo(new BigDecimal(2000.0)) < 0){
            profitBeforeTaxesSausages = costOfSausageProductionIsFrom1000to2000.multiply(quantityOfSausageSoldInKg);
        } else {
            profitBeforeTaxesSausages = costOfSausageProductionIsFrom2000.multiply(quantityOfSausageSoldInKg);
        }
        profitBeforeTaxesSausages = amountOfMoneyFromSaleOfSausage.subtract(profitBeforeTaxesSausages);

        //считаем прибыль по ветчине до налогов
        BigDecimal profitBeforeTaxesHam = new BigDecimal(0.0);
        profitBeforeTaxesHam = costOfHamInProduction.multiply(quantityOfHamSoldInKg);
        profitBeforeTaxesHam = amountOfMoneyFromSaleOfHam.subtract(profitBeforeTaxesHam);

        //считаем прибыль по шейки до налогов
        BigDecimal profitBeforeTaxesNeck = new BigDecimal(0.0);
        if (quantityOfNeckSoldInKg.compareTo(new BigDecimal(500.0)) >= 0 ){
            profitBeforeTaxesNeck = costOfNeckDuringProductionIsGreaterThanOrEqualTo500kg.multiply(quantityOfNeckSoldInKg);
        } else {
            profitBeforeTaxesNeck = costOfNeckDuringProductionIsLess500kg.multiply(quantityOfNeckSoldInKg);
        }
        profitBeforeTaxesNeck = amountOfMoneyFromSaleOfNeck.subtract(profitBeforeTaxesNeck);

        //считаем общую прибыль до налогов
        BigDecimal profitBeforeTaxes = BigDecimal.valueOf(0.0);
        profitBeforeTaxes = profitBeforeTaxesSausages.add(profitBeforeTaxesHam).add(profitBeforeTaxesNeck);
        profitBeforeTaxes = profitBeforeTaxes.subtract(new BigDecimal(1_000_000));
        System.out.println("прибыль до налогов компании = " + profitBeforeTaxes);

        //считаем общую прибыль после налогов
        BigDecimal profitAfterTaxes = BigDecimal.valueOf(0.0);
        BigDecimal onePercentOfMillion = new BigDecimal(1_000_000.0).divide(new BigDecimal(100.0));
        if (profitBeforeTaxes.compareTo(new BigDecimal(1_000_000.0)) <= 0 ){
            BigDecimal onePercentOfProfitsOne = profitBeforeTaxes.divide(new BigDecimal(100.0), RoundingMode.HALF_UP);
            profitAfterTaxes = onePercentOfProfitsOne.multiply(new BigDecimal(8.0));
            profitAfterTaxes = profitBeforeTaxes.subtract(profitAfterTaxes);
        } else if (profitBeforeTaxes.compareTo(new BigDecimal(2_000_000.0)) <= 0 ) {
            BigDecimal profitAfterTaxes8Profits = onePercentOfMillion.multiply(new BigDecimal(8.0));
            profitAfterTaxes = profitBeforeTaxes.subtract(new BigDecimal(1_000_000));
            BigDecimal onePercentOfProfitsTwo = profitAfterTaxes.divide(new BigDecimal(100.0), RoundingMode.HALF_UP);
            BigDecimal profitAfterTaxes10Profits = onePercentOfProfitsTwo.multiply(new BigDecimal(10.0));
            profitAfterTaxes = profitBeforeTaxes.subtract(profitAfterTaxes8Profits);
            profitAfterTaxes = profitAfterTaxes.subtract(profitAfterTaxes10Profits);
        } else {
            BigDecimal profitAfterTaxes8Profits = onePercentOfMillion.multiply(new BigDecimal(8.0));
            BigDecimal profitAfterTaxes10Profits = onePercentOfMillion.multiply(new BigDecimal(10.0));
            profitAfterTaxes = profitBeforeTaxes.subtract(new BigDecimal(2_000_000));
            BigDecimal onePercentOfProfitsThree = profitAfterTaxes.divide(new BigDecimal(100.0), RoundingMode.HALF_UP);
            BigDecimal profitAfterTaxes13Profits = onePercentOfProfitsThree.multiply(new BigDecimal(13.0));
            profitAfterTaxes = profitBeforeTaxes.subtract(profitAfterTaxes8Profits);
            profitAfterTaxes = profitAfterTaxes.subtract(profitAfterTaxes10Profits);
            profitAfterTaxes = profitAfterTaxes.subtract(profitAfterTaxes13Profits);
        }
        System.out.println("прибыль после налогов компании = " + profitAfterTaxes);
    }
}
