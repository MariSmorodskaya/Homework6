package ru.netology.stats.NewHomework6;

public class StatsService {
    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(int[] sales) {
        int maxMonth = sales[0]; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int SumAllSales(int[] sales) {
        int sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = (int) (sumSales + sales[i]);
        }
        return sumSales;
    }

    public int AverageSalesM(int[] sales) {
        int averageSales = 0;
        for (int i = 0; i < sales.length; i++) {
            averageSales = (int) (averageSales + sales[i]);
        }
        int averageSalesMonth;
        averageSalesMonth = averageSales / sales.length;

        return averageSalesMonth;

    }

    public int minMonthBelowSales(int[] sales) {
        int min = AverageSalesM(sales);
        int belowAverageMonth = 0;
        for (int sale : sales) {
            if (sale < min) {
                belowAverageMonth = belowAverageMonth + 1;
            }
        }
        return belowAverageMonth;
    }

    public int maxMonthAboveSales(int[] sales) {
        int max = AverageSalesM(sales);
        int aboveAverageMonth = 0;
        for (int sale : sales) {
            if (sale > max) {
                aboveAverageMonth = aboveAverageMonth + 1;
            }
        }

        return aboveAverageMonth;
    }

}

