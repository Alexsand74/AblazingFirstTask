package org.javaacademy.core.homework5.ex2;

import org.javaacademy.core.homework5.Runner;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class ComputerSpy extends Computer {
    //Создать компьютерного шпиона, который наследуется от компьютера,
    // при этом хранит в себе обычный компьютер
    //Сделать так, чтобы при вызове методов компьютерного шпиона:
    //1. При входе пользователя делалась запись в comp.log "Пользователь {имя пользователя} вошел"
    // и вызывался метод компьютера.
    //2. При выходе делалась запись в comp.log "Пользователь вышел"
    //3. При отправке сообщения, делалась запись в comp.log:
    // "Пользователь {имя пользователя} отправил сообщение {текст сообщения}"
    // и вызвался метод компьютера.

    private static final String PATH_COMP = "\\resources\\comp.log";
    private static final String SOURCE_DIRECTORY = "target";

    public Computer computer;

    public ComputerSpy(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void userLogin(String nameUser) {
        String nameUserLog = "Пользователь {" + nameUser + "} вошел";
        entryLog(nameUserLog);
        super.userLogin(nameUser);
    }

    @Override
    public void userLogout() {
        String nameUserLog = "Пользователь вышел";
        entryLog(nameUserLog);
        super.userLogout();
    }

    @Override
    public void sendsMessage(String message) {
        entryLog(message);
        super.sendsMessage(message);
    }

    private void entryLog(String message) {
        String pathRunner = "";
        StringBuilder modifiedString = new StringBuilder();
        try {
            pathRunner = resourcePathTemplate();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        pathRunner = pathRunner.replace("\\", " ");
        String[] arrayStrings = pathRunner.split(" ");
        for (String word : arrayStrings) {
            if (SOURCE_DIRECTORY.equals(word)) {
                break;
            }
            modifiedString.append(word);
            modifiedString.append(" ");
        }

        modifiedString = new StringBuilder(modifiedString.toString()
                                                         .trim()
                                                         .replace(" ", "\\"));
        String resourceComp = modifiedString + PATH_COMP;

        try (FileWriter writer = new FileWriter(resourceComp, true)) {
            writer.write(message + "\n");
        } catch (IOException e) {
             e.printStackTrace();
        }
    }

    private String resourcePathTemplate() throws UnsupportedEncodingException {
        File currentClass = new File(URLDecoder.decode(Runner.class
                .getProtectionDomain()
                .getCodeSource()
                .getLocation()
                .getPath(), StandardCharsets.UTF_8));
        return currentClass.getParent();
    }
}
