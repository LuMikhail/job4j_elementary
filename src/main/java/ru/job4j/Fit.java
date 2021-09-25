package ru.job4j;

public class Fit {

    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(187);
        double woman = Fit.womanWeight(178);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 178 is " + woman);
}

}

