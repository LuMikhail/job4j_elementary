package ru.job4j.calculator;

public class SqArea {
    public static double square(int p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double rsl = l * h;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        double result2 = SqArea.square(7, 3);
        double result3 = SqArea.square(5, 2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        System.out.println(" p = 7, k = 3, s = 2.296875, real = " + result2);
        System.out.println(" p = 5, k = 2, s = 1.388888888888889, real = " + result3);
    }
}
