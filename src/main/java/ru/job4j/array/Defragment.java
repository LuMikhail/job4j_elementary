package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int nullIndex = index;
                for (nullIndex = index  + 1; nullIndex < array.length; nullIndex++) {
                    if (array[nullIndex] != null) {
                        String temp = array[index];
                        array[index] = array[nullIndex];
                        array[nullIndex] = temp;
                        break;
                    }
                    }
                }
            }
            return array;
    }
}
