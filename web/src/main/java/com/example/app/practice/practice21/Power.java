package com.example.app.practice.practice21;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("正の整数を入力してください: ");
        int base = scanner.nextInt();
        System.out.print("累乗する指数を入力してください: ");
        int exponent = scanner.nextInt();

        int result = power(base, exponent);

        System.out.println(base + "の" + exponent + "乗は " + result + " です。");
        scanner.close();
    }

    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }
}
