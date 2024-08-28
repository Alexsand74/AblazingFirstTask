package org.javaacademy.core.homework5.ex1;

public class WordNumberTranslationException extends Exception {
    public WordNumberTranslationException(String message) {
        super(message);
    }

    public WordNumberTranslationException() {
        super("numbers are not extracted from the word");
    }
}
