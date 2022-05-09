package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwitchWeekTest {

    @Test
    void monday() {
        int day = 1;
        String actual = SwitchWeek.nameOfDay(day);
        String expected = "Понедельник";
        assertEquals(actual, expected);
    }

    @Test
    void tuesday () {
        int day = 2;
        String actual = SwitchWeek.nameOfDay(day);
        String expected = "Вторник";
        assertEquals(actual, expected);
    }
}