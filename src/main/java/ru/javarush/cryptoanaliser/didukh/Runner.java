package ru.javarush.cryptoanaliser.didukh;

import ru.javarush.cryptoanaliser.didukh.toplevel.Application;
import ru.javarush.cryptoanaliser.didukh.controller.MainController;
import ru.javarush.cryptoanaliser.didukh.entity.Result;
import ru.javarush.cryptoanaliser.didukh.toplevel.Console;



public class Runner {
    public static void main(String[] args) {
        Console.start();
        args = Console.commands;
        MainController mainController = new MainController();
        Application application = new Application(mainController);
        Result result = application.run(args);
    }
}
