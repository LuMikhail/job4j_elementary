package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void rubleToDollar() {
        float dol = 140;
        float expecteddol = 2.3333333f;
        float outdol = Converter.rubleToDollar(dol);
        float eps = 0.0001f;
        Assert.assertEquals(expecteddol, outdol, eps);
            }
}