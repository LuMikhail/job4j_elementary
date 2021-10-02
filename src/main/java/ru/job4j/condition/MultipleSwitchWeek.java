package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Monday" -> 1;
            default -> - 1;
        };
    }

        public static void main(String[] args) {
        System.out.println(numberOfDay("Monday"));
    }
}
