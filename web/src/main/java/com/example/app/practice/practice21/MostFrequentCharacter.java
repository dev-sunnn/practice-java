package com.example.app.practice.practice21;

import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("文字列を入力してください: ");
        String input = scanner.nextLine();

        int[] count = new int[256];

        for (int i = 0; i < input.length(); i++) {
            count[input.charAt(i)]++;
        }

        int maxCount = 0;
        char mostFrequentChar = ' ';

        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                mostFrequentChar = (char) i;
            }
        }

        System.out.println("最も出現回数の多い文字: " + mostFrequentChar);

        scanner.close();
    }
}
