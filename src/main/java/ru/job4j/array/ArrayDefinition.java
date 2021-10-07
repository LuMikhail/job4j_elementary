package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] nums = new String[4];
        nums[0] = "Nikolay";
        nums[1] = "Olga";
        nums[2] = "Kati";
        nums[3] = "Oleg";
        System.out.println("Размер массива равен " + ages.length);
        System.out.println("Размер массива равен " + surnames.length);
        System.out.println("Размер массива равен " + prices.length);
        System.out.println("Размер массива равен " + nums.length);
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
    }
}
