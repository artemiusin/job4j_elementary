package ru.job4j.condition;

public class RectangleArea {
    public static double square(double p, double k) {
        double result = (p / (2 * (k + 1))) * k * (p / (2 * (k + 1)));
        return result;
    }

    public static void main(String[] args) {
        double result = RectangleArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result);
    }
}