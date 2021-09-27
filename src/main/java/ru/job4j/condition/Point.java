package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 3, 0);
        double result2 = Point.distance(1, 0, 6, 0);
        double result3 = Point.distance(1, 1, 2, 3);
        System.out.println("расстояния между точками1 (0, 0) to (3, 0) " + result);
        System.out.println("расстояния между точками2 (1, 0) to (6, 0) " + result2);
        System.out.println("расстояния между точками3 (1, 1) to (2, 3) " + result3);
    }
}
