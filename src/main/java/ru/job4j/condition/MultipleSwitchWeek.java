package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник" -> 1;
            case "Вторник" -> 2;
            default -> 0;
        };
    }

        public static void main(String[] args) {
        System.out.println(numberOfDay("Понедельник"));
            System.out.println(numberOfDay("Вторник"));
    }
}
