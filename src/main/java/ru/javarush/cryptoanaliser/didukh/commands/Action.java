package ru.javarush.cryptoanaliser.didukh.commands;

import ru.javarush.cryptoanaliser.didukh.entity.Result;

public interface Action {
    Result execute(String[] parameters);
}
