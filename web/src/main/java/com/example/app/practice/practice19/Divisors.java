package com.example.app.practice.practice19;

import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("正の整数を入力してください: ");
        int n = scanner.nextInt();
        
        System.out.print(n + "の約数: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
}
