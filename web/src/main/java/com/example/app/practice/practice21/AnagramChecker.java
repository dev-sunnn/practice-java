package com.example.app.practice.practice21;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1つ目の文字列を入力してください: ");
        String str1 = scanner.nextLine();

        System.out.print("2つ目の文字列を入力してください: ");
        String str2 = scanner.nextLine();

        boolean isAnagram = checkAnagram(str1, str2);

        if (isAnagram) {
            System.out.println("アナグラムです");
        } else {
            System.out.println("アナグラムではありません");
        }

        scanner.close();
    }

    public static boolean checkAnagram(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
