package com.example.app.practice.practice19;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("正の整数を入力してください: ");
        int n = scanner.nextInt();
        
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        System.out.println(n + "の階乗は " + factorial + " です。");
        scanner.close();
    }
}
