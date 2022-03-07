package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP7K8Square1dot20() {
        double expected = 1.20;
        int p = 7;
        double k = 8;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K17Square31() {
        double expected = 1.31;
        int p = 10;
        double k = 17;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}