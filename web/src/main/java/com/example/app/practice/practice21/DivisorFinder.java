package com.example.app.practice.practice21;

import java.util.Scanner;

public class DivisorFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("整数を入力してください: ");
        int num = scanner.nextInt();

        System.out.print(num + "の約数: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
