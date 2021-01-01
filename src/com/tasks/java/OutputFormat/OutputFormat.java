package com.tasks.java.OutputFormat;

import java.util.Scanner;
import java.util.stream.IntStream;

import static java.lang.String.format;

public class OutputFormat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        IntStream.rangeClosed(0,3).forEach(i -> {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.println(format("%-15s%03d", s1, x));
        });
        System.out.println("================================");

    }
}
