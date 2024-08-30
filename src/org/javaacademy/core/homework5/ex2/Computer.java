package org.javaacademy.core.homework5.ex2;

public class Computer {
    //Создать компьютер:
    //1. Компьютер хранит в себе пользователя, который вошел в компьютер
    //2. Компьютер умеет:
    //2.1. Делать вход пользователя (на вход имя пользователя).
    // Изменяет пользователя, который зашел в компьютер
    //2.2 Делать выход пользователя. Удаляет пользователя из системы
    //2.3. Отправляет сообщение (на вход текст сообщения).
    // Печатает на экран "сообщение: {текст сообщения}".
    protected String nameUser;

    public void userLogin(String nameUser) {
        this.nameUser = nameUser;
    }

    public void userLogout() {
        this.nameUser = null;
    }

    public void sendsMessage(String message) {
        print(message);
    }

    public void print(String message) {
        System.out.println(message);
    }
}
