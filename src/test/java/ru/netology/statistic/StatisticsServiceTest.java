package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StatisticsServiceTest {

    StatisticsService service = new StatisticsService();

    @Test
    void shouldFindMaxInMiddle() {
        long[] incomes = {5, 8, 3, 10, 6, 4};
        long expected = 10;
        assertEquals(expected, service.findMax(incomes));
    }

    @Test
    void shouldFindMaxAtStart() {
        long[] incomes = {10, 8, 6, 4, 2};
        long expected = 10;
        assertEquals(expected, service.findMax(incomes));
    }

    @Test
    void shouldFindMaxAtEnd() {
        long[] incomes = {1, 2, 3, 4, 10};
        long expected = 10;
        assertEquals(expected, service.findMax(incomes));
    }

    @Test
    void shouldFindMaxWithAllSame() {
        long[] incomes = {7, 7, 7, 7};
        long expected = 7;
        assertEquals(expected, service.findMax(incomes));
    }

    @Test
    void shouldFindMaxWithNegativeNumbers() {
        long[] incomes = {-10, -20, -30, -5, -15};
        long expected = -5;
        assertEquals(expected, service.findMax(incomes));
    }

    @Test
    void shouldFindMaxWithSingleElement() {
        long[] incomes = {42};
        long expected = 42;
        assertEquals(expected, service.findMax(incomes));
    }
}
