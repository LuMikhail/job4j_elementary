package ru.job4j;

public class TrgArea {

        public static double area(double a, double b, double c) {
            double p = (a + b + c);
            double p2 = p * (p - a) * (p - b) * (p - c);
            double rsl = Math.sqrt(p2);
            return rsl;
        }

        public static void main(String[] args) {
            double rsl = TrgArea.area(2, 2, 2);
            System.out.println("area (2, 2, 2) = " + rsl);
        }
}
