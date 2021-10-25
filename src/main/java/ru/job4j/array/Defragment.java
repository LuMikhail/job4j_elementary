package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                for (int nullidex = index  + 1; nullidex < array.length; nullidex++) {
                    if (array[nullidex] != null) {
                        String temp = array[index];
                        array[index] = array[nullidex];
                        array[nullidex] = temp;
                        break;
                    }
                }
            }
        }
        return array;
    }
}
