package ru.javarush.cryptoanaliser.didukh.toplevel;

import ru.javarush.cryptoanaliser.didukh.entity.Result;
import ru.javarush.cryptoanaliser.didukh.controller.MainController;

import java.util.Arrays;

public class Application {
    private final MainController mainController;

    public Application(MainController mainController) {

        this.mainController = mainController;
    }

    public Result run(String[] args) {
        String command = args[0];
        String[] parameters = Arrays.copyOfRange(args,1,args.length);
        return mainController.execute(command,parameters);
    }
}
