package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] nambers = new int[5];
        for (int i = 0; i < nambers.length; i++) {
            nambers[i] = i * 2 + 3;
        }
        for (int i = 0; i < nambers.length; i++) {
            System.out.println(nambers[i]);
        }
    }
}
