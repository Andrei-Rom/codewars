package com.codewars.kyu6.buyingacar.main;

public class BuyCar {

    public static int[] nbMonths(int startPriceOld, int startPriceNew,
                                 int savingperMonth, double percentLossByMonth) {
        if (startPriceOld > startPriceNew) {
            return new int[]{0, startPriceOld - startPriceNew};
        }
        double priceOld = startPriceOld;
        double priceNew = startPriceNew;
        int month = 0;
        double available = startPriceOld - startPriceNew;
        while (available < 0) {
            month++;
            priceOld = priceOld - priceOld * percentLossByMonth / 100;
            priceNew = priceNew - priceNew * percentLossByMonth / 100;

            available = priceOld + savingperMonth * month - priceNew;

            if (month % 2 != 0) {
                percentLossByMonth += 0.5;
            }
        }

        return new int[]{month, (int) Math.round(available)};
    }
}
