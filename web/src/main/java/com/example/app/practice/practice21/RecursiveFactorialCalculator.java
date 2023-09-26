package com.example.app.practice.practice21;

import java.util.Scanner;

public class RecursiveFactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("整数を入力してください: ");
        int num = scanner.nextInt();

        int factorial = calculateFactorial(num);

        System.out.println(num + "の階乗: " + factorial);

        scanner.close();
    }

    public static int calculateFactorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * calculateFactorial(num - 1);
        }
    }
}
