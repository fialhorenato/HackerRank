package com.tasks.algorithms.LeftRotate;

import java.util.Arrays;
import java.util.List;

public class LeftRotate {
    public static void main(String[] args) {
        var arr = List.of(1, 2, 3, 4, 5);
        var result = rotateLeft(4, arr);
        System.out.println(result);
    }

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        List<Integer> newList = Arrays.asList(new Integer[arr.size()]);
        for (int i = 0; i < arr.size(); i++) {
            int position = (i + arr.size() - d) % arr.size();
            newList.set(position, arr.get(i));
        }
        return newList;
    }
}
