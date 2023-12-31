package ru.netology.stats;

public class StatsService {
    public long getSumSales(int[] sales) {
        long sumSales = 0;

        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
        }

        return sumSales;
    }

    public long getAverageSales(int[] sales) {
        long sumSales = getSumSales(sales);
        long averageSales = 0;
        averageSales = sumSales / sales.length;


        return averageSales;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int getQuantityMonthLessAverageSales(int[] sales) {
        long averageSales = getAverageSales(sales);


        int quantityMonthLessAverageSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                quantityMonthLessAverageSales++;
            }
        }
        return quantityMonthLessAverageSales;
    }

    public int getQuantityMonthMoreAverageSales(int[] sales) {
        long averageSales = getAverageSales(sales);

        int quantityMonthMoreAverageSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                quantityMonthMoreAverageSales++;
            }
        }
        return quantityMonthMoreAverageSales;
    }
}
