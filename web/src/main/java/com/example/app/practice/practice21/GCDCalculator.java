package com.example.app.practice.practice21;

import java.util.Scanner;

public class GCDCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("整数を入力してください: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        System.out.println("最大公約数: " + gcd);

        scanner.close();
    }
}
