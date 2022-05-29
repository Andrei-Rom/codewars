package com.codewars.kyu6.bouncingballs.main;

public class BouncingBall {
    public static int bouncingBall(double h, double bounce, double window) {
        if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) {
            return -1;
        }

        int seen = 1;
        while ((h = h * bounce) > window) {
            seen += 2;
        }
        return seen;
    }
}
