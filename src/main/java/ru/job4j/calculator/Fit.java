package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short  height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        double man = ru.job4j.Fit.manWeight(180);
        double woman = ru.job4j.Fit.womanWeight(170);
        System.out.println("Man 180 is " + man);
        System.out.println("Woman 170 is " + woman);
    }
}

