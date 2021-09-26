package ru.job4j.condition;

public class Point {
    public static double distanceOne(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl;
    }

    public static double distanceTwo(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl;
    }

    public static double distanceThree(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distanceOne(0, 0, 3, 0);
        double result2 = Point.distanceTwo(0, 0, 4, 0);
        double result3 = Point.distanceThree(1, 0, 2, 0);
        System.out.println("расстояния между точками1 (0, 0) to (3, 0) " + result);
        System.out.println("расстояния между точками2 (0, 0) to (4, 0) " + result2);
        System.out.println("расстояния между точками3 (0, 0) to (1, 0) " + result3);
    }
}
