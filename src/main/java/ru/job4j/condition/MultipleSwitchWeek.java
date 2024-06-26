package ru.job4j.condition;

public class MultipleSwitchWeek {

    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Thuesday" -> 2;
            case "Среда", "Wensday" -> 3;
            default -> -1;
        };
    }
}