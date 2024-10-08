package org.javaacademy.core.homework2;

import org.javaacademy.core.homework2.office.Runner;

import java.util.Arrays;
import java.util.Random;

public class Homework2 {
    public static void main(String[] args) {
        ex1();
        System.out.println("-----------------------------------------------");
        ex2();
        System.out.println("-----------------------------------------------");
        ex3();
        System.out.println("-----------------------------------------------");
        ex4();
        System.out.println("-----------------------------------------------");
        ex5();
    }

    public static void ex1() {
        //Дан массив со словами
        String[] words = {"Это", "шашлык", "на", "шампуре"};
        //С помощью циклов и функции String.substring составить итоговый текст
        //Это-шашлык-на-шампуре
        //первый вариант решения
        String resultLine = "";
        final String lineToInsert = "-";
        int wordsSize = words.length;
        int lastWord = words.length - 1;
        for (int i = 0; i < wordsSize; i++) {
            resultLine += words[i];
            if (i < lastWord) {
                resultLine += lineToInsert;
            }
        }
        System.out.println(resultLine);

        //второй вариант решения
        resultLine = "";
        for (int i = 0; i < wordsSize; i++) {
            resultLine += (words[i].stripLeading() + lineToInsert);
        }
        int beginIndex = 0;
        int endIndex = resultLine.length() - 1;
        resultLine = resultLine.substring(beginIndex,endIndex);
        System.out.println(resultLine);
    }

    public static void ex2() {
        //Дан массив с массивом чисел внутри
        int[][] arrayOfNumbers = new int[10][10];
        arrayOfNumbers[0] = new int[]{131, 1, 1, 1, 1, 1, 1, 1, 1, 102};
        arrayOfNumbers[1] = new int[]{1, 20, 1, 1, 1, 1, 1, 1, 93, 1};
        arrayOfNumbers[2] = new int[]{1, 1, 31, 1, 1, 1, 1, 81, 1, 1};
        arrayOfNumbers[3] = new int[]{1, 1, 1, 45, 1, 1, 77, 1, 1, 1};
        arrayOfNumbers[4] = new int[]{1, 1, 1, 1, 57, 67, 1, 1, 1, 1};
        arrayOfNumbers[5] = new int[]{1, 1, 1, 1, 533, 68, 1, 1, 1, 1};
        arrayOfNumbers[6] = new int[]{1, 1, 1, 40, 1, 1, 72, 1, 1, 1};
        arrayOfNumbers[7] = new int[]{1, 1, 30, 1, 1, 1, 1, 83, 1, 1};
        arrayOfNumbers[8] = new int[]{1, 20, 1, 1, 1, 1, 1, 1, 901, 1};
        arrayOfNumbers[9] = new int[]{10, 1, 1, 1, 1, 1, 1, 1, 1, 101};
        //Посчитать сумму каждой диагонали ИСПОЛЬЗУЯ цикл(ы)
        //С левого верхнего угла к нижнему правому
        int leftUpToRightDownSum = 0; //
        //С левого нижнего угла к верхнему правому
        int leftDownToRightUpSum = 0;
        //Вывести на экран
        int lastNumber = arrayOfNumbers.length - 1;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            leftUpToRightDownSum += arrayOfNumbers[i][i];
            leftDownToRightUpSum += arrayOfNumbers[lastNumber - i][i];
        }
        System.out.println("Cумма диагонали с левого верхнего угла к нижнему правому = "
                + leftUpToRightDownSum);
        System.out.println("Сумма диагонали с левого нижнего угла к верхнему правому = "
                + leftDownToRightUpSum);
    }

    public static void ex3() {
//        //Дан распределитель случайных чисел
//        Random random = new Random(1); // (1) <- задает постоянную последовательность, порождаемых чисел
//        //Получение случайного числа
//        int number = random.nextInt(1000);
//        //Написать код, генерирующий случайные числа до тех пор, пока не сгенерируется 999.
//        //Вывести номер попытки, с которой получилось получить случайным образом число 999.
        Random random = new Random(1);
        int number;
        int attemptСounter = 0;
        final int requiredNumber = 999;
        while (true) {
            number = random.nextInt(1000);
            attemptСounter++;
            if (requiredNumber == number) {
                System.out.println("Hомер попытки, " + attemptСounter
                                + " с которой получилось получить случайным образом число = "
                                + requiredNumber
                                + "\n");
                break;
            }
        }
//        решение второе
        attemptСounter = 1;
        while (random.nextInt(1000)!= requiredNumber) {
            attemptСounter++;
            }
            System.out.println("Hомер попытки, " + attemptСounter
                    + " с которой получилось получить случайным образом число = "
                    + requiredNumber
                    + "\n");
        }


    public static void ex4() {
        //Создать пакет office.
        //Создать класс офис, в котором есть босс, менеджер, секретарь, охранник.
        //Office Boss Manager Secretary SecurityGuard
        //Босс обладает именем. Умеет подгонять менеджера - "{Имя менеджера}" быстрее!
        //Менеджер обладает именем. Умеет кричать - "я ничего не успеваю, помогите!".
        //Секретарь умеет просить менеджера и босса успокоится, а охранника подождать:
        //"{Имя босса} не волнуйтесь, {имя менеджера} все успеет. {имя охранника} - подождите!"
        //Охранник обладает именем. Просит выдать ему аванс.
        //В офисе есть метод рабочий день:
        //--Босс начинает подгонять менеджера
        //--Менеджер кричит
        //--Охранник просит аванс
        //--Секретарша всех успокаивает, и просит подождать
        //Создать класс Runner, в котором:
        //Создать босса (Петр Николаевич), Менеджера (Володя), охранника (Петрович)
        //Секретаря.
        //Создать офис
        //Запустить рабочий день в офисе
        Runner.start();
    }

    /**
     * Для продвинутых
     */
    public static void ex5() {
        //Перевернуть массив(без сторонних классов,методов и стримов), не создавая новый массив.
        // Вывести на экран.
        //"перевернуть" - значит последние элементы становятся первыми и наоборот.
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("До переворачивания -> " + Arrays.toString(numbers));
        //первое решение
        int temp;
        int halfSize = numbers.length/2;
        int lastNumber = numbers.length - 1;
        for (int i = 0; i < halfSize; i++) {
            temp = numbers[i];
            numbers[i] = numbers[lastNumber - i];
            numbers[lastNumber - i] = temp;
        }
        System.out.println("После переворачивания -> " + Arrays.toString(numbers));
        Arrays.sort(numbers);

        // второе решение
        System.out.println("До переворачивания -> " + Arrays.toString(numbers));
        for (int i = 0; i < halfSize; i++) {
            numbers[i] = numbers[i] ^ numbers[lastNumber - i];
            numbers[lastNumber - i] = numbers[i] ^ numbers[lastNumber - i];
            numbers[i] = numbers[i] ^ numbers[lastNumber - i];
        }
        System.out.println("После переворачивания -> " + Arrays.toString(numbers));
    }
}
