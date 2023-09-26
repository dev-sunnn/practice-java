package com.example.app.practice.practice19;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("正の整数を入力してください: ");
        int n = scanner.nextInt();
        
        System.out.print(n + "の素因数分解: ");
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        
        scanner.close();
    }
}
