package com.example.app.practice.practice21;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("文字列を入力してください: ");
        String input = scanner.nextLine();

        String reverse = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);
        }

        System.out.println("逆順の文字列: " + reverse);

        scanner.close();
    }
}
