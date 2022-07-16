package ru.javarush.cryptoanaliser.didukh.controller;

import ru.javarush.cryptoanaliser.didukh.commands.Action;
import ru.javarush.cryptoanaliser.didukh.commands.Brute;
import ru.javarush.cryptoanaliser.didukh.commands.Decoder;
import ru.javarush.cryptoanaliser.didukh.commands.Encoder;

import java.util.Locale;

public enum Actions {
    ENCODE(new Encoder()),
    DECODE(new Decoder()),
    BRUTE(new Brute());
    private final Action action;


    Actions(Action action) {

        this.action = action;
    }

    public static Action find(String command) {

        return Actions.valueOf(command.toUpperCase()).action;
    }
}
