package com.tasks.DynamicArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DynamicArray {
    public static void main(String[] args) {
        List<List<Integer>> arr = List.of(
                List.of(2, 5),
                List.of(1, 0, 5),
                List.of(1, 1, 7),
                List.of(1, 0, 3),
                List.of(2, 1, 0),
                List.of(2, 1, 1)
        );
    }

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        Integer lastAnswer = 0;
        List<Integer> seqList = new ArrayList<>();
        return Collections.emptyList();
    }
}
