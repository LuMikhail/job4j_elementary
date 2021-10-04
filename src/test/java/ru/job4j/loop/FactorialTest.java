package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void wenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
        int result = Factorial.calc(n);
        int expected = 120;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void wenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int result = Factorial.calc(n);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}
