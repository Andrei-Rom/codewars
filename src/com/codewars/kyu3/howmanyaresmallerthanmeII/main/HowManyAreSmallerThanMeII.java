package com.codewars.kyu3.howmanyaresmallerthanmeII.main;

public class HowManyAreSmallerThanMeII {

    public static int[] smaller(int[] unsorted) {
        int[] result = new int[unsorted.length];
        Basket root = null;

        for (int i = (unsorted.length - 1); i >= 0; i--) {
            root = insert(root, unsorted[i], result, 0, i);
        }
        return result;
    }

    public static Basket insert(Basket basket, int element, int[] counting, int sum, int i) {
        if (basket == null) {
            counting[i] = sum;
            return new Basket(element);
        }

        if (basket.element == element) {
            basket.duplicate++;
            counting[i] = sum + basket.count;
        } else if (basket.element < element) {
            basket.right = insert(basket.right, element, counting, sum + basket.count + basket.duplicate, i);
        } else {
            basket.count++;
            basket.left = insert(basket.left, element, counting, sum, i);
        }
        return basket;
    }

    private static class Basket {
        private final int element;
        private int count = 0;
        private int duplicate = 1;
        private Basket left = null;
        private Basket right = null;

        private Basket(int element) {
            this.element = element;
        }
    }
}