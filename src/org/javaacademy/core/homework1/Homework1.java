package org.javaacademy.core.homework1;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.math.BigDecimal.valueOf;

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
        String endingWordFemale = "ова ".trim().toUpperCase();
        String endingWordMasculine = "ов ".trim().toUpperCase();
        if (surname.contains(endingWordFemale)) {
            System.out.println("Уважаемая " + name);
        } else if (surname.contains(endingWordMasculine)) {
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

        //константы
        final int zero = 0;
        final BigDecimal eight = new BigDecimal(8.0);
        final BigDecimal ten = new BigDecimal(10.0);
        final BigDecimal thirteen = new BigDecimal(13.0);
        final BigDecimal oneHundred = new BigDecimal(100.0);
        final BigDecimal fiveHundred = new BigDecimal(500.0);
        final BigDecimal thousand = new BigDecimal(1000.0);
        final BigDecimal twoThousand = new BigDecimal(2000.0);
        final BigDecimal million = new BigDecimal(1_000_000.0);
        final BigDecimal twoMillion = new BigDecimal(2_000_000.0);

        final BigDecimal sausagePrice = valueOf(800.0);
        final BigDecimal costSausage1000kg = valueOf(412.0);
        final BigDecimal costSausage1000to2000 = valueOf(408.0);
        final BigDecimal costSausage2000 = valueOf(404.0);

        final BigDecimal priceHam = valueOf(350.0);
        final BigDecimal costHam = valueOf(275.0);

        final BigDecimal neckSalePrice = valueOf(500.0);
        final BigDecimal costNeckDuring500kg = valueOf(311.0);
        final BigDecimal costOfNeckDuring500kg = valueOf(299.0);

        final BigDecimal quantSausageSoldKg = valueOf(2000.0);
        final BigDecimal quantyHamSoldKg = valueOf(8511.0);
        final BigDecimal quantNeckSoldKg = valueOf(6988.0);

        //считаем полную сумму от проданного продукта за все проданные килограммы
        BigDecimal amountSaleSausage = sausagePrice.multiply(quantSausageSoldKg);
        BigDecimal amountFromSaleHam = priceHam.multiply(quantyHamSoldKg);
        BigDecimal amountMoneyFromSaleNeck = neckSalePrice.multiply(quantNeckSoldKg);

        //считаем доход по колбасе до налогов
        BigDecimal incomeBefTaxesSausages;
        if (quantSausageSoldKg.compareTo(thousand) < zero) {
            incomeBefTaxesSausages = costSausage1000kg.multiply(quantSausageSoldKg);
        } else if (quantSausageSoldKg.compareTo(twoThousand) < 0) {
            incomeBefTaxesSausages = costSausage1000to2000.multiply(quantSausageSoldKg);
        } else {
            incomeBefTaxesSausages = costSausage2000.multiply(quantSausageSoldKg);
        }
        incomeBefTaxesSausages = amountSaleSausage.subtract(incomeBefTaxesSausages);

        //считаем доход по ветчине до налогов
        BigDecimal profitBeforeTaxesHam;
        profitBeforeTaxesHam = costHam.multiply(quantyHamSoldKg);
        profitBeforeTaxesHam = amountFromSaleHam.subtract(profitBeforeTaxesHam);

        //считаем доход по шейки до налогов
        BigDecimal profitBeforeTaxesNeck;
        if (quantNeckSoldKg.compareTo(fiveHundred) >= zero) {
            profitBeforeTaxesNeck = costOfNeckDuring500kg.multiply(quantNeckSoldKg);
        } else {
            profitBeforeTaxesNeck = costNeckDuring500kg.multiply(quantNeckSoldKg);
        }
        profitBeforeTaxesNeck = amountMoneyFromSaleNeck.subtract(profitBeforeTaxesNeck);

        //считаем общий доход до налогов
        BigDecimal profitBeforeTaxes;
        profitBeforeTaxes = incomeBefTaxesSausages.add(profitBeforeTaxesHam).add(profitBeforeTaxesNeck);
        profitBeforeTaxes = profitBeforeTaxes.subtract(million);
        System.out.println("доход до налогов компании = " + profitBeforeTaxes);

        //считаем общий доход после налогов
        BigDecimal intermediateIncomeValue;
        BigDecimal taxIncomeUpToMillion = BigDecimal.ZERO;
        BigDecimal taxIncomeUpToTwoMillion = BigDecimal.ZERO;
        BigDecimal taxIncomeBelowAndAboveThoseMillions = BigDecimal.ZERO;
        BigDecimal onePercentMillion = million.divide(oneHundred);

        if (profitBeforeTaxes.compareTo(million) <= zero) {

            taxIncomeUpToMillion = profitBeforeTaxes
                    .subtract((profitBeforeTaxes
                            .divide((oneHundred), RoundingMode.HALF_UP))
                            .multiply(eight));

        } else if (profitBeforeTaxes.compareTo(twoMillion) <= zero) {

            BigDecimal profitAfterTaxes8Profits = onePercentMillion
                    .multiply(eight);

            intermediateIncomeValue = profitBeforeTaxes
                    .subtract(million);

            BigDecimal profitAfterTaxes10Profits = (intermediateIncomeValue
                    .divide((oneHundred), RoundingMode.HALF_UP))
                    .multiply(ten);

            taxIncomeUpToTwoMillion = profitBeforeTaxes
                    .subtract(profitAfterTaxes8Profits)
                    .subtract(profitAfterTaxes10Profits);
        } else {
            BigDecimal profitAfterTaxes8Profits = onePercentMillion
                    .multiply(eight);
            BigDecimal profitAfterTaxes10Profits = onePercentMillion
                    .multiply(ten);

            intermediateIncomeValue = profitBeforeTaxes
                    .subtract(twoMillion);

            BigDecimal profitAfterTaxes13Profits = (intermediateIncomeValue
                    .divide(oneHundred, RoundingMode.HALF_UP))
                    .multiply(thirteen);

            taxIncomeBelowAndAboveThoseMillions = profitBeforeTaxes.subtract(profitAfterTaxes8Profits)
                    .subtract(profitAfterTaxes10Profits)
                    .subtract(profitAfterTaxes13Profits);
        }
        System.out.println("доход после налогов компании = "
                + taxIncomeUpToMillion
                .add(taxIncomeUpToTwoMillion)
                .add(taxIncomeBelowAndAboveThoseMillions)
        );
    }
}
