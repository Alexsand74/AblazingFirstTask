package org.javaacademy.core.homework4;

import org.javaacademy.core.homework4.ex1.CarWash;
import org.javaacademy.core.homework4.ex1.transport.Bus;
import org.javaacademy.core.homework4.ex1.transport.PassengerCar;
import org.javaacademy.core.homework4.ex1.transport.Transport;
import org.javaacademy.core.homework4.ex2.flying.Airplane;
import org.javaacademy.core.homework4.ex2.flying.Duck;
import org.javaacademy.core.homework4.ex3.Bird;
import org.javaacademy.core.homework4.ex3.Human;
import org.javaacademy.core.homework4.ex3.Driver;
import org.javaacademy.core.homework4.ex3.Builder;
import org.javaacademy.core.homework4.ex3.Sounding;
import org.javaacademy.core.homework4.ex4.herbivore.Elephant;
import org.javaacademy.core.homework4.ex4.herbivore.Rabbit;
import org.javaacademy.core.homework4.ex4.predator.Tiger;
import org.javaacademy.core.homework4.ex4.predator.Wolf;

public class Runner {
    public static void main(String[] args) {
        ex1();
        System.out.println("------------------------------------------");
        ex2();
        System.out.println("------------------------------------------");
        ex3();
        System.out.println("------------------------------------------");
        ex4();
    }

    public static void ex1() {
        //Создать легковую машину (атрибуты: чистая/грязная, размеры(ширина, высота, длина), наличие круиз контроля)
        //Создать автобус (атрибуты: чистый/грязный, размеры(ширина, высота, длина), макс количество пассажиров)
        //Создать автомойку
        //Автомойка умеет мыть машину. Делает машину чистой. Возвращает стоимость помывки.
        //Автомойка умеет мыть машины. Делает машины чистыми. Возвращает стоимость помывки за все машины.
        //Категории автомобилей:
        //если длина > 6 или высота > 2.5 метра или ширина > 2, то машина считается крупной,
        //иначе считается маломерной.
        //Тариф 4000 - для крупных авто.
        //Тариф 2000 - для маломерных.
        //В автомойку были отправлены грязные машины мэрии: 4 легковых(длина высота ширина) (5х2х1.8),
        //5 автобусов(12х3х2.3)
        //Посчитать и вывести: сколько мэрия заплатит денег за мойку всех машин.
        CarWash carWash = new CarWash();
        PassengerCar car = new PassengerCar(5, 2, 1.8);
        Bus bus = new Bus(12, 3, 2.3);
        Transport[] transportArrays = {car, car, car, car, bus, bus, bus, bus, bus, bus};
        System.out.println("Сумма за мойку всех авто = " + carWash.cleanTransports(transportArrays));
    }

    public static void ex2() {
        //Задача №2
        //1. Создать два класса, которые умеют летать: самолет и утка. Атрибут утки: isInjured (ранен),
        // атрибут самолета: countPassengers.
        //2. Создать интерфейс, который объединяет эти два класса.
        //3. Имплементировать его в двух классах
        //4. Реализовать метод летать:
        // Для утки:
        // Метод летать будет выкидывать ошибку FlyException (создать такой класс), если утка подстрелена,
        // иначе печатать на экран "утка летит"
        // Для самолета:
        // Метод летать будет выкидывать ошибку FlyException, если количество пассажиров меньше нуля.
        // Иначе печать "самолет летит"
        //5. Создать 1 утку не раненую, 1 утку раненую, 1 самолет с 10 пассажирами, 1 самолет с -1 пассажиром.
        //6. Вызвать у них метод летать.
        // Перехватить исключения: вывести на экран текст
        // Ожидание (то что будет в консоли):
        // утка летит
        // Ошибка: утка ранена
        // самолет летит
        // Ошибка: пассажиров в самолете меньше 0
        Duck duck = new Duck(false);
        Duck woundedDuck = new Duck(true);
        Airplane airplane = new Airplane(10);
        Airplane emptyAirplane = new Airplane(-1);

        try {
            duck.fly();
            woundedDuck.fly();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            airplane.fly();
            emptyAirplane.fly();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void ex3() {
        //Задача №3 - Звук вокруг
        //Человек умеет издавать звук: "Я человек." (возвращается строка и в след пунктах тоже)
        //Строитель умеет издавать звук: "Я строитель." + звук из человека
        //Водитель умеет издавать звук: "Я водитель." (водитель является человеком,
        // но не использует его родительский метод)
        //Птица умеет издавать звук: "Чирик"
        //Сделать так, чтобы они все могли быть представлены к единому типу - "Издающий звук".
        //Создать в этом методе человека, строителя, водителя и птицу. Запихнуть в единый массив.
        //Пройтись по массиву и заставить их издать звуки.
        Sounding[] soundingArray = {new Human(), new Builder(), new Driver(), new Bird()};
        for (Sounding el : soundingArray) {
            el.sounding();
        }
    }

    public static void ex4() {
        //Задача №4 - Страсти по Дарвину.
        //Создать следующую структуру
        //             Живое
        //          /          \
        //    Хищник             Травоядное
        //    /     \            /         \
        // волк   тигр       кролик        слон
        //
        //Живое - обладает свойством жив/мертв, вес. Умеет умирать - переход в состояние мертв.
        //
        //Хищник
        //Умеет нападать на живое. В случае если вес жертвы больше хищника, то хищник погибает,
        //иначе вес хищника увеличивается на треть веса жертвы и жертва погибает.
        //Может нападать только при живом состоянии, иначе выпадает ошибка "Животное не может нападать".
        //
        //Травоядное - умеет бегать (не определено как).
        // Но все травоядные могут бегать только в состоянии живое.
        //Иначе выдает ошибку - "Животное не может бегать".
        //
        //Тигр умеет нападать на живое, но за счет ловкости может съесть жертву весом до двух раз больше него.
        //Остальные условия такие же как при нападении хищника.
        //
        //Волк - не обладает уникальными свойствами или действиями.
        //Кролик - умеет бегать (печать "кролик быстро бежит")
        //Слон - умеет бегать (печать "слон медленно бежит")
        //
        //Создать отдельный пакет и Runner. В Runner:
        //1.Создать: Тигра(300 кг), Волка(50 кг), Кролика(2 кг), Слона (2000 кг)
        //2.Кролик, должен пробежать
        //3.Волк, ест кролика
        //4.Тигр, ест волка
        //5.Тигр, пытается съесть слона
        //6.Слон, пробегает
        //7.Вызвать у съеденного кролика бег, сделать так, чтобы программа НЕ закончилась с ошибкой,
        //а распечатала текст ошибки.

        Tiger tiger = new Tiger(300);
        Wolf wolf = new Wolf(50);
        Rabbit rabbit = new Rabbit(2);
        Elephant elephant = new Elephant(2000);
        try {
            rabbit.run();
            wolf.attack(rabbit);
            tiger.attack(wolf);
            tiger.attack(elephant);
            elephant.run();
            rabbit.run();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
