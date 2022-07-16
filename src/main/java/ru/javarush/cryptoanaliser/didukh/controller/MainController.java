package ru.javarush.cryptoanaliser.didukh.controller;

import ru.javarush.cryptoanaliser.didukh.commands.Action;
import ru.javarush.cryptoanaliser.didukh.entity.Result;

public class MainController {
    public Result execute(String command, String[] parameters) {
        Action action = Actions.find(command);
        return action.execute(parameters);
    }
}
