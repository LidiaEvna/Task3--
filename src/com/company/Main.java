package com.company;

import java.util.Scanner;

public class Main {
    public static long multiply(long a, long b)
    {
        if (a == 0 || b == 0)
            return 0;
        boolean negative = false;
        if (a < 0) {
            negative = true;
            a = -a;
        }
        if (b < 0) {
            negative = !negative;
            b = -b;
        }
        int result = 0;
        for (int i = 1; i <= a; ++i)
            result += b;
        return negative ? -result : result;
    }
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long a = scanner.nextInt();
        final long b = scanner.nextInt();

        System.out.println(multiply(a, b));
    }
}