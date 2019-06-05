package edu.utesa.lib.utils;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Tools {
    private static Scanner scanner = new Scanner(System.in);

    private static boolean isPrime(int n) {
        return n > 1 && IntStream.range(2, n).noneMatch(i -> n % i == 0);
    }

    public static boolean isTwin(int n) {
        return Tools.isPrime(n) && Tools.isPrime(n + 2);
    }

    public static int readInt() {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            return 0;
        }
    }

    public static String convertToRoman(int num) {
        int i, miles, hundred, tens, units;
        StringBuilder romano = new StringBuilder();

        miles = num / 1000;
        hundred = num / 100 % 10;
        tens = num / 10 % 10;
        units = num % 10;

        for (i = 1; i <= miles; i++) romano.append("M");

        if (hundred == 9) romano.append("CM");
        else if (hundred >= 5) {
            romano.append("D");
            for (i = 6; i <= hundred; i++) {
                romano.append("C");
            }
        } else if (hundred == 4) {
            romano.append("CD");
        } else {
            for (i = 1; i <= hundred; i++) {
                romano.append("C");
            }
        }

        if (tens == 9) {
            romano.append("XC");
        } else if (tens >= 5) {
            romano.append("L");
            for (i = 6; i <= tens; i++) {
                romano.append("X");
            }
        } else if (tens == 4) {
            romano.append("XL");
        } else {
            for (i = 1; i <= tens; i++) {
                romano.append("X");
            }
        }

        if (units == 9) {
            romano.append("IX");
        } else if (units >= 5) {
            romano.append("V");
            for (i = 6; i <= units; i++) {
                romano.append("I");
            }
        } else if (units == 4) {
            romano.append("IV");
        } else {
            for (i = 1; i <= units; i++) {
                romano.append("I");
            }
        }
        return romano.toString();
    }

    public static boolean areBrotherNumber(long num1, long num2) {
        return dividers(num1) == (num2) && dividers(num2) == (num1);
    }

    public static boolean isMagnificent(long num) {
        return dividers(num) == num;
    }

    private static long dividers(long num) {
        return IntStream.iterate(1, i -> i < num, i -> i + 1).filter(i -> num % i == 0).asLongStream().sum();
    }

    public static boolean areBinary(long num) {
        for (char c : String.valueOf(num).toCharArray()) {
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }

    private static boolean areBinary(long num1, long num2) {
        for (char c : String.valueOf(num1 + num2).toCharArray()) {
            if (c != 0 && c != 1) {
                return false;
            }
        }
        return true;
    }
}
