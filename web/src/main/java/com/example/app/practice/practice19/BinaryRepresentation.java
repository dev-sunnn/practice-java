package com.example.app.practice.practice19;

import java.util.Scanner;

public class BinaryRepresentation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("正の整数を入力してください: ");
        int n = scanner.nextInt();
        
        String binary = "";
        while (n > 0) {
            binary = (n % 2) + binary;
            n /= 2;
        }
        
        System.out.println("二進数表現: " + binary);
        scanner.close();
    }
}
