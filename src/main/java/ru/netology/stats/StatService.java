package ru.netology.stats;

public class StatService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int peakSalesMonth(long[] sales) {

        int peakSalesMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[peakSalesMonth]) {
                peakSalesMonth = i;
            }
        }
        return peakSalesMonth + 1;
    }

    public int minSalesMonth(long[] sales) {
        int minSalesMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minSalesMonth]) {
                minSalesMonth = i;
            }
        }
        return minSalesMonth + 1;
    }

    public int revenueBellowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }

        }

        return counter;
    }

    public int revenueAboveAverage(long[] sales) {
        int counter = 0;
        long avarage = average(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avarage) {
                counter = counter + 1;
            }
        }
        return counter;

    }
}

