package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
     public void shouldFindMinSale (){
        StatsService service = new StatsService();

        long [] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedMonth = 9;
        int actualMonth = (int) service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }
    @Test
    public void shouldCalculateSum (){
        StatsService service = new StatsService();
        long [] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedSum = 180;
        int actualSum = (int) service.sumSale(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldCalculateMidSum (){
        StatsService service = new StatsService();
        long [] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedMidSum = 15;
        int actualMidSum = service.midSale(sales);

        Assertions.assertEquals(actualMidSum, expectedMidSum);
    }

    @Test
    public void shouldFindMaxSale (){
        StatsService service = new StatsService();
        long [] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedMaxSale = 8;
        int actualMaxSale = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxSale, actualMaxSale);

    }
    @Test
    public void shouldFindMinMidSale () {
        StatsService service = new StatsService();
        long [] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedMinMidSale = 11;
        int actualMaxSale = service.minMidSale(sales);

        Assertions.assertEquals(expectedMinMidSale, actualMaxSale);
    }
    @Test
    public void shouldFindMaxMidSale () {
        StatsService service = new StatsService();
        long [] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedMaxMidSale = 12;
        int actualMaxSale = service.maxMidsale(sales);

        Assertions.assertEquals(expectedMaxMidSale, actualMaxSale);
    }
}
