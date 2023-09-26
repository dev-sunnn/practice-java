package com.example.app.practice.practice19;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("正の整数を入力してください: ");
        int n = scanner.nextInt();
        
        double sqrt = Math.sqrt(n);
        
        System.out.println(n + "の平方根は " + sqrt + " です。");
        scanner.close();
    }
}
