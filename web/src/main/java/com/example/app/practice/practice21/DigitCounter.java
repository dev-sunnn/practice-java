package com.example.app.practice.practice21;

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("整数を入力してください: ");
        int num = scanner.nextInt();

        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }

        System.out.println("桁数: " + count);

        scanner.close();
    }
}
