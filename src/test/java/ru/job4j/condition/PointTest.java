package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to22then3dot60() {
        double expected = 3.60;
        int x1 = 0;
        int y1 = 3;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to2then4dot47() {
        double expected = 4.47;
        int x1 = 0;
        int y1 = 4;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

        @Test
        public void when00to20then6dot32() {
            double expected = 6.32;
            int x1 = 0;
            int y1 = 6;
            int x2 = 2;
            int y2 = 0;
            double out = Point.distance(x1, y1, x2, y2);
            Assert.assertEquals(expected, out, 0.01);
        }
}