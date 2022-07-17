package ru.javarush.cryptoanaliser.didukh.controller;

import ru.javarush.cryptoanaliser.didukh.commands.*;

import java.util.Locale;

public enum Actions {
    ENCODE(new Encoder()),
    DECODE(new Decoder()),
    BRUTE(new Brute()),
    STATISTIC(new Statistic());
    private final Action action;


    Actions(Action action) {

        this.action = action;
    }

    public static Action find(String command) {

        return Actions.valueOf(command.toUpperCase()).action;
    }
}
