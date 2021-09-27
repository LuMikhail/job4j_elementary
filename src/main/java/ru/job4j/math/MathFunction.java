package ru.job4j.math;

public class MathFunction {
    public static double sum(double first, double second) {
        return first + second;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }

    public static double multiply2(double first, double second) {
        return (first - second + first / second);
    }

    public static double multiply3(double first, double second) {
        return (first + second) + (first * second) + (first - second + first / second);
    }
}
