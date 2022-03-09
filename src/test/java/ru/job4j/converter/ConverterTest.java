package ru.job4j.converter;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RublesToEuroThen2() {
        float in = 140;
        float expected = 2;
        float actual = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertEquals(expected, actual, eps);
    }

    @Test
    public void whenConvert120RublesToDollarsThen2() {
        float in = 120;
        float expected = 2;
        float actual = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertEquals(expected, actual, eps);
    }
}