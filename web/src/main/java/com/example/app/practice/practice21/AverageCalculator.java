package com.example.app.practice.practice21;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("整数を入力してください: ");
            int num = scanner.nextInt();
            sum += num;
        }
        
        double average = (double) sum / 10;
        System.out.println("合計値: " + sum);
        System.out.println("平均値: " + average);
        
        scanner.close();
    }
}
