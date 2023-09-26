package com.example.app.practice.practice21;

import java.util.Scanner;

public class BinaryDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("正の整数を入力してください: ");
        int n = scanner.nextInt();

        int digits = countBinaryDigits(n);

        System.out.println(n + "の二進数表現の桁数は " + digits + " 桁です。");
        scanner.close();
    }

    public static int countBinaryDigits(int n) {
        int count = 0;
        while (n > 0) {
            n /= 2;
            count++;
        }
        return count;
    }
}
