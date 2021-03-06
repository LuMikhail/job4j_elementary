package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distanceOne() {
            double expected = 3;
            int x1 = 0;
            int y1 = 0;
            int x2 = 3;
            int y2 = 0;
            double out = Point.distance(x1, y1, x2, y2);
            Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distanceTwo() {
        double expected = 5;
        int x1 = 1;
        int y1 = 0;
        int x2 = 6;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distanceThree() {
        double expected = 2.23;
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
