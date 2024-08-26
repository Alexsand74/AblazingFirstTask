package org.javaacademy.core.homework5.ex2;

public class RunnerEx2 {
    //Создать Runner
    //1. В нем создать компьютер.
    //2. Создать шпиона с компьютером из пункта 1
    //3. Сделать вход пользователя, отправку сообщения, выход пользователя через компьютерного шпиона.
    //4. Проверить наличие логов в comp.log
    // (файл должен быть внутри репозитория и отправлен в удаленное репо)
    public static void start() {
        Computer computer = new Computer();
        ComputerSpy computerSpy = new ComputerSpy(computer);
        computerSpy.userLogin("Maks");
        computerSpy.sendsMessage("Hello friends!)");
        computerSpy.userLogout();
        computerSpy.userLogin("Alexs");
        computerSpy.sendsMessage("Hello my friend Alex!)");
        computerSpy.userLogout();
    }
}
