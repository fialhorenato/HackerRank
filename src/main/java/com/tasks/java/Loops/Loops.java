package com.tasks.java.Loops;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.stream.IntStream.rangeClosed;

public class Loops {
    private static final Scanner scanner = new Scanner(in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        rangeClosed(1, 10)
                .mapToObj(i -> String.format("%d x %d = %d", N, i, N * i))
                .forEach(out::println);

        scanner.close();
    }
}
