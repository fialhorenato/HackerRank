package com.tasks.ReverseArray;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2};
        var reversed = reverseArray(arr);
        Arrays.stream(reversed).forEach(System.out::print);
    }

    static int[] reverseArray(int[] a) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[Math.abs((a.length - 1) - i)] = a[i];
        }
        return result;
    }
}
