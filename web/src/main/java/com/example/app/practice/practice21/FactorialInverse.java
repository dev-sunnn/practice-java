package com.example.app.practice.practice21;

import java.util.Scanner;

public class FactorialInverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("正の整数を入力してください: ");
        int n = scanner.nextInt();

        double factorialInverse = 1.0 / factorial(n);

        System.out.println(n + "の階乗の逆数は " + factorialInverse + " です。");
        scanner.close();
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
