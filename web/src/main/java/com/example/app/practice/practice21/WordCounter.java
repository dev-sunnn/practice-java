package com.example.app.practice.practice21;

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("文字列を入力してください: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        int count = words.length;

        System.out.println("単語の数: " + count);

        scanner.close();
    }
}
