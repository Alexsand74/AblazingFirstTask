package org.javaacademy.core.homework3;

import org.javaacademy.core.homework3.ImmutableCity.City;
import org.javaacademy.core.homework3.ImmutableCity.House;
import org.javaacademy.core.homework3.phoneFactory.Iphone;
import org.javaacademy.core.homework3.phoneFactory.IphoneFactory;
import org.javaacademy.core.homework3.phoneFactory.Samsung;
import org.javaacademy.core.homework3.phoneFactory.SamsungFactory;
import org.javaacademy.core.homework3.pyramid.Pyramid1;

public class Runner {
    public static void main(String[] args) {
        //В этом дз уже будет, проверятся наличие корректных модификаторов доступа
        //у классов, атрибутов, методов
        ex1();
        System.out.println("-------------------------------------");
        ex2();
        System.out.println("-------------------------------------");
        ex3();
        System.out.println("-------------------------------------");
        ex4();
    }

    public static void ex1() {
        //Зайди в shop.Runner
        org.javaacademy.core.homework3.shop.Runner.main();
    }

    public static void ex2() {
        //Задача: Фабрика телефонов
        //Организовать, фабрику создания двух телефонов
        //
        //Создать комплектующие телефона
        //Камера: умеет фотографировать. Свойство - количество мега пикселей.
        //Процессор: свойство - количество вычислений в секунду (mhz)
        //Корпус: свойства - размеры - ширина, высота, длина
        //
        //Создать телефон Samsung, который состоит из процессора, камеры, корпуса.
        //Умеет фотографировать используя камеру (печать в консоль - "сделано фото")
        //
        //Создать телефон Iphone, который состоит из двух процессоров, камеры, корпуса.
        //Умеет фотографировать используя камеру (печать в консоль - "сделано фото").
        //Умеет печатать на экран информацию о процессорах.
        //
        //Создать фабрику Iphone, которая:
        //Создает iphone и заполняет его двумя процессорами (1000 Mhz), 8 мегапиксельной камерой,
        // и корпусом 60х200х10
        //
        //Создать фабрику Samsung, которая:
        //Создает samsung и заполняет его процессором (1500 Mhz), 16 мегапиксельной камерой,
        // и корпусом 60х200х15
        //ВНИМАНИЕ! Фабрики создают телефоны без создания экземпляра фабрики!

        Samsung samsung = SamsungFactory.weDo();
        System.out.println(samsung);
        samsung.takesPhoto();
        System.out.println();

        Iphone iphone = IphoneFactory.weDo();
        System.out.println(iphone);
        iphone.takesPhoto();
        iphone.processorInformation();
        System.out.println();
    }

    public static void ex3() {
        //Задача: Пирамида наследования
        //Создать классы Pyramid1, Pyramid2, Pyramid3.
        //НЕОБХОДИМО НАСЛЕДОВАНИЕ С ИСПОЛЬЗОВАНИЕМ РОДИТЕЛЬСКИХ МЕТОДОВ!
        // Создать метод print, который будет выводить следующий текст:
        // M <- из Pyramid1
        // MM <- из Pyramid2
        // MMM <- из Pyramid3

        //Т.е. при вызове pyramid1.print выведется:
        // M
        // MM
        // MMM

        //при вызове pyramid2.print выведется:
        // MM
        // MMM

        //при вызове pyramid3.print выведется:
        // MMM

        //создать здесь экземпляр класса pyramid1 и вызвать print

        Pyramid1 pyramid1 = new Pyramid1();
        pyramid1.print();
    }

    /**
     * Для продвинутых
     */
    public static void ex4() {
        //Зада: Иммутабельный город.
        //
        //Создать класс House (наименование улицы, номер дома) - создать сеттеры! и геттеры на него.
        //Переопределить вывод в текст - вывод улицы и номера дома
        //Создать иммутабельный класс City (наименование города, и массив домов).
        //Переопределить вывод в текст - чтобы выводило имя города, и все дома
        //
        //1. Создать два дома, создать город с массивом созданных домов
        //2. Сделать так, чтобы у города нельзя было поменять свойства.
        //3. Сделать так, что если дом получен из города, то при изменении свойств этого дома,
        // эти изменения не затронут дом находящийся внутри города.
        // Т.е. результат должен соответствовать псевдокоду ниже:
        //
        // City city = new City({new House('Lenina', 1)});
        // System.out.println(city);
        //-- City{House{street: Lenina, house: 1}}
        //House house = city.getHouses()[0];
        //house.setStreet('Kotova');
        //System.out.println(house);
        //-- House{street: Kotova, house: 1}
        //System.out.println(city);
        //-- City{House{street: Lenina, house: 1}}
        House lenina2 = new House("Lenina", 2);
        System.out.println(lenina2);
        House kotova1 = new House("Kotova", 1);
        System.out.println(kotova1);
        House[] array = {lenina2, kotova1};
        City city = new City("Kolima", array);
        System.out.println(city);
        System.out.println(city.getHouses()[0]);
        House house = city.getHouses()[0];
        house.setName("Pervomayskaya");
        house.setNumber(88);
        System.out.println(house);
        city.getHouses()[0].setName("Pervomayskaya");
        city.getHouses()[0].setNumber(44);
        System.out.println(city.getHouses()[0]);
    }
}
