package com.example.app.practice.practice21;

import java.util.Scanner;

public class LCMCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("整数を入力してください: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int lcm = Math.max(num1, num2);
        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                break;
            }
            lcm++;
        }

        System.out.println("最小公倍数: " + lcm);

        scanner.close();
    }
}
