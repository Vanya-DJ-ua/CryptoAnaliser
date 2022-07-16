package ru.javarush.cryptoanaliser.didukh.constans;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class Strings {
    private static final String rusLetters = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private static final String engLetters = "abcdefghijklmnopqrstuvwxyz";
    private static final String cyphers = "0123456789";
    private static final String symbols = ".,/'][}{!?)(;=+-_ ";
    public  static final String  ALPHABET = rusLetters + rusLetters.toUpperCase() + engLetters + engLetters.toUpperCase() + cyphers + symbols;
}
