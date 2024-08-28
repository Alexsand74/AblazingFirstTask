package org.javaacademy.core.homework5;

import org.javaacademy.core.homework5.ex1.RunnerEx1;
import org.javaacademy.core.homework5.ex2.RunnerEx2;

public class Runner {
    public static void main(String[] args) {
        ex1();
        System.out.println("------------------------------------------------------------");
        ex2();
    }

    private static void ex1() {
        //Донаты со всего мира
        //Одному блогеру присылают пожертвования(донаты) за его ролики
        //Данные о пожертвованиях содержатся в файле donationMy.csv (папка resources)
        //Необходимо посчитать сумму пожертвований от пользователей из каждой страны
        //Если сумма написана некорректно, то программа должна пропускать строчку (не завершать работу)
        // String[] countries = {"Россия", "Франция", "Китай", "Япония", "Турция"};
        // String filename = "donationMy.csv";
        //Чтение файла из папки resources (без привязки к конкретному расположению проекта)
        // Scanner scanner = new Scanner(Runner.class.getClassLoader().getResourceAsStream(filename));
        // System.out.println(scanner.nextLine());

        //Ожидаемый вывод:
        //Список пожертвований по странам (пример):
        //Россия - 14233.00
        //Франция - 8000.32
        //Китай - 20000.11
        //Япония - 124.10
        //Турция - 777.55

        // первое решение, пользуемся enum, сохраняя и суммируя в него донаты по странам
        RunnerEx1.start1();
        System.out.println("------------------------------------------------------------");
        System.out.println("второе решение");
        System.out.println("------------------------------------------------------------");
        // второе решение, применяем массив стран и использует второй массив с донатами,
        // от стран их объединяет одинаковая последовательность от 0 до кол-во стран
        // (один и тот же номер элемента в разных массивах)
        // накапливаем суммы по странам, и выводим пропуская те страны сумма с которых = 0
        RunnerEx1.start2();
    }

    private static void ex2() {
        //Сделать компьютерного шпиона
        //Смысл задания - отслеживать действия реального объекта и записывать их в лог
        //Создать компьютер:
        //1. Компьютер хранит в себе пользователя, который вошел в компьютер
        //2. Компьютер умеет:
        //2.1. Делать вход пользователя (на вход имя пользователя).
        // Изменяет пользователя, который зашел в компьютер
        //2.2 Делать выход пользователя. Удаляет пользователя из системы
        //2.3. Отправляет сообщение (на вход текст сообщения).
        // Печатает на экран "сообщение: {текст сообщения}".

        //Создать компьютерного шпиона, который наследуется от компьютера,
        // при этом хранит в себе обычный компьютер
        //Сделать так, чтобы при вызове методов компьютерного шпиона:
        //1. При входе пользователя делалась запись в comp.log "Пользователь {имя пользователя} вошел"
        // и вызывался метод компьютера.
        //2. При выходе делалась запись в comp.log "Пользователь вышел"
        //3. При отправке сообщения, делалась запись в comp.log:
        // "Пользователь {имя пользователя} отправил сообщение {текст сообщения}"
        // и вызвался метод компьютера.

        //Создать Runner
        //1. В нем создать компьютер.
        //2. Создать шпиона с компьютером из пункта 1
        //3. Сделать вход пользователя, отправку сообщения, выход пользователя через компьютерного шпиона.
        //4. Проверить наличие логов в comp.log
        // (файл должен быть внутри репозитория и отправлен в удаленное репо)
        RunnerEx2.start();
    }
}
