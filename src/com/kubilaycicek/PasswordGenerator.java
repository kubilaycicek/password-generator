package com.kubilaycicek;

import java.util.Random;

public class PasswordGenerator {

    private final static String capitalChars = "ABCDEFGHIKLMNOPQRSTUVWXYZ";
    private final static String smallChars = "abcdefghiklmnopqrstuvwxyz";
    private final static String number = "0123456789";
    private final static String symbols = "!@#$%^&*_=+-/.?<>)";
    private final static String values = capitalChars + smallChars + number + symbols;

    public static char[] generate(int length) {

        Random random = new Random();

        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            password[i] = values.charAt(random.nextInt(values.length()));
        }

        return password;
    }
}
