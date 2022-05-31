package com.codewars.kyu6.equalsidesofanarray.main;

public class EqualSidesOfAnArray {
    public static int findEvenIndex(int[] arr) {
        int rightSum = 0;
        int leftSum = 0;
        for (int element : arr) {
            rightSum += element;
        }

        for (int i = 0; i < arr.length; i++) {
            rightSum -= arr[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
}
