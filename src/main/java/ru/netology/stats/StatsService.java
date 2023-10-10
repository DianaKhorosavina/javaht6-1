package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int sumSale(long[] sales) { //сумма всех продаж
        int sumSale = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSale = (int) (sales[i] + sumSale);
        }
        return sumSale;
    }

    public int midSale(long [] sales) {//средняя сумма продаж в месяц
        long sum = sumSale(sales);
        int midSale = 0;
        if (sales.length > 0) {
            midSale = (int) (sum / sales.length);
        }
        return midSale;
    }


    public int maxSales(long[] sales) {  //месяц с максимальными продажами
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;

    }

    public int minMidSale(long[] sales) { //продажи ниже среднего
        int midSale = midSale(sales);
        int minMidSale = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= (int) midSale) {
                minMidSale = i;
            }
        }
        return minMidSale + 1;
    }

    public int maxMidsale(long[] sales) { //продажи выше среднего
        int midSale = midSale(sales);
        int maxMidSale = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= (int) midSale) {
                maxMidSale = i;
            }
        }
        return maxMidSale + 1;
    }
}





