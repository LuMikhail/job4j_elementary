package ru.job4j.math;

public class MathFunction {
    public static double sum(double first, double second) {
        return first + second;
    }

    public static double multipli(double first, double second) {
        return first * second;
    }

    public static double subtracDivision(double first, double second) {
        return (first - second + first / second);
    }

    public static double multiSumSubtrac(double first, double second) {
        return (first + second) + (first * second) + (first - second + first / second);
    }
}
