package com.codewars.kyu4.rectanglerotation.main;

public class RectangleRotation {
    private static final double SQRT_2 = Math.sqrt(2);

    public static int rectangleRotation(final int a, final int b) {
        int aNorm = 2 * (int) Math.floor(a / SQRT_2);
        int bNorm = 2 * (int) Math.floor(b / SQRT_2);

        int area = (aNorm + 1) * (bNorm + 1) / 2;

        return area % 2 == 0 ? area + 1 : area;
    }
}
