package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            result = data[0] == data[i - 1];
        }
        return result;
    }
}