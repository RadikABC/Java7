package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldSumSale() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSumSales = 180;
        long actualSumSales = service.getSumSales(sales);

        Assertions.assertEquals(expectedSumSales, actualSumSales);

    }

    @Test
    public void shouldAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSumSales = 15;
        long actualAverageSales = service.getAverageSales(sales);

        Assertions.assertEquals(expectedSumSales, actualAverageSales);
    }

    @Test
    public void shouldMaxSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 8;
        int actualMaxMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void shouldMinSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;
        int actualMinMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void shouldQuantityMonthLessAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedQuantityMonthLessAverageSales = 5;
        int actualQuantityMonthLessAverageSales = service.getQuantityMonthLessAverageSales(sales);

        Assertions.assertEquals(expectedQuantityMonthLessAverageSales, actualQuantityMonthLessAverageSales);
    }

    @Test
    public void shouldQuantityMonthMoreAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedQuantityMonthMoreAverageSales = 5;
        int actualQuantityMonthMoreAverageSales = service.getQuantityMonthMoreAverageSales(sales);

        Assertions.assertEquals(expectedQuantityMonthMoreAverageSales, actualQuantityMonthMoreAverageSales);
    }


}
