package com.example.app.practice;

/**
 * 基本：Javaの基礎（配列）：解答
 */
public class Practice5 {
    /** practice 1 */
    // 解答：33
    public static void main(String[] args) {
        int[] a = {3, 69, 21, 33, 4};
        System.out.println(a[3]);
    }

    /** practice 2 */
    // エラーケース
    // 解答：a[ ] に存在しないインデックス（ 5 ）を指定しているため。
    // public static void main(String[] args) {
    //     int[] a = {3, 69, 21, 33, 4};
    //     System.out.println(a[5]);
    // }

    /** practice 3 */
    // public static void main(String[] args) {
    //     // 解答例
    //     // 5教科を配列、平均を求める箇所でlengthが書けていれば問題ないと思います。
    //     int[] score = {20, 60, 40, 80, 50};
    //     int sum = 0;
    //     for (int i = 0; i < score.length; i++) {
    //         sum += score[i];
    //     }
    //     int avg = sum / score.length;
    //     System.out.println("5教科の合計：" + sum);
    //     System.out.println("5教科の平均：" + avg);
    // }

    /** practice 4 */
    // public static void main(String[] args) {
    //     // 解答例
    //     int[] mobileBillList = {19874, 34107, 30972, 28541, 32217};
    //     int month = 1;
    //     for (int i = 0; i < mobileBillList.length; i++) {
    //     String result = month + "月：" + mobileBillList[i] + "円";
    //     System.out.println(result);
    //     month++;
    //     }
    // }

    /** practice 5 */
    // 解答：
    // scores.length：2
    // scores[0].length：3

    // public static void main(String[] args) {
    //     int[][] scores = {
    //         {10, 20, 30}, {30, 40, 50}
    //     };
    //     System.out.println(scores.length);
    //     System.out.println(scores[0].length);
    // }

}
