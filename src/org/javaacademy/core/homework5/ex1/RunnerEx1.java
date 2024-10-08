package org.javaacademy.core.homework5.ex1;

import org.javaacademy.core.homework5.Runner;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Scanner;

public class RunnerEx1 {
    //Запись в файле:
    //Список пожертвований по странам (пример):
    //ttttttttttttttttt
    //Россия ; 14233,00
    //Франция - 8000.3g2
    //Китай;20000.11d
    //Япония  124.10
    //yyyyyyyyy yyyyyyy
    //Турция777.55
    //Китай - 20000.11д
    //Франция - 80f00.32
    //Китай - 20000.11d
    //Япония - 0,96710

    //Ожидаемый вывод:
    //Список пожертвований по странам (пример):
    //Россия - 14233.00
    //Франция - 8000.32
    //Китай - 20000.11
    //Япония - 124.10
    //Турция - 777.55

    private static final int THERE_IS_NO_INDEX = -1;
    private static final String filename = "donation.csv";
    private static final String[] countries = {"Россия", "Франция", "Китай", "Япония", "Турция"};
    private static final String[] lineNumbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private static final BigDecimal[] countriesDonations = {BigDecimal.ZERO,
                                                            BigDecimal.ZERO,
                                                            BigDecimal.ZERO,
                                                            BigDecimal.ZERO,
                                                            BigDecimal.ZERO};

    public static void start1() {
        try (Scanner scanner = new Scanner(Objects.requireNonNull(Runner.class
                .getClassLoader()
                .getResourceAsStream(filename)))
        ) {
            while (scanner.hasNext()) {
                convertStringIntoDonationsOne(scanner.nextLine());
            }
        }
        for (Countries element : Countries.values()) {
            if (element.getDonations().equals(BigDecimal.ZERO)) {
                continue;
            }
            System.out.println(element.getName() + " - " + element.getDonations());
        }
    }

    private static void convertStringIntoDonationsOne(String lineString) {
        Countries[] countriesArray = Countries.values();
        for (Countries element : countriesArray) {
            if (lineString.startsWith(element.getName())) {
                try {
                    BigDecimal lastNumber = element.getDonations();
                    element.setDonations(lastNumber.add(extractDonationString(lineString)));
                } catch (NumberFormatException | WordNumberTranslationException e) {
                }
            }
        }
    }

    public static void start2() {
        try (Scanner scanner = new Scanner(Objects.requireNonNull(Runner.class
                .getClassLoader()
                .getResourceAsStream(filename)))
        ) {
            while (scanner.hasNext()) {
                convertStringIntoDonationsTwo(scanner.nextLine());
            }
        }
        for (int i = 0; i < countries.length; i++) {
            if (countriesDonations[i].equals(BigDecimal.ZERO)) {
                continue;
            }
            System.out.println(countries[i] + " - " + countriesDonations[i]);
        }
    }

    private static void convertStringIntoDonationsTwo(String lineString) {
        for (int i = 0; i < countries.length; i++) {
            if (lineString.startsWith(countries[i])) {
                try {
                    countriesDonations[i] = countriesDonations[i].add(extractDonationString(lineString));
                } catch (NumberFormatException | WordNumberTranslationException e) {
                }
            }
        }
    }

    /**
     * От первой встречающейся в строке цифры (включая её) вырезает подстроку
     * и далее переводит её в число формата BigDecimal
     * если внутри подстроки есть другие символы кроме цифр, не учитываем "," или "."
     * метод выкидывает WordNumberTranslationException
     */
    private static BigDecimal extractDonationString(String word) throws WordNumberTranslationException {
        int tempIndex;
        int index = word.length();

        String tempWord;
        for (String lineNumber : lineNumbers) {
            tempIndex = word.indexOf(lineNumber);
            if (tempIndex != THERE_IS_NO_INDEX && tempIndex < index) {
                index = tempIndex;
            }
        }

        tempWord = word.substring(index).replace(",", ".");
        if (!checkWordFromNumbers(tempWord)) {
            throw new WordNumberTranslationException();
        }
        return BigDecimal.valueOf(Double.parseDouble(tempWord));
    }

    /**
     * Проверяем слово состоит ли оно только из цифр и точки
     */
    private static boolean checkWordFromNumbers(String word) {
        word = word.replace(".", "");
        return word.matches("\\d+");
    }
}
