package com.example.app.practice.practice21;

import java.util.Scanner;

public class FactorialDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("正の整数を入力してください: ");
        int n = scanner.nextInt();

        int factorial = factorial(n);
        int sum = calculateDigitSum(factorial);

        System.out.println(n + "の階乗の各桁の総和は " + sum + " です。");
        scanner.close();
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int calculateDigitSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }
}
