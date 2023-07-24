package com.example.app.practice;

/**
 * 基本２：javaの基礎（ループ処理）
 */
public class Practice9 {
    /** practice 1 */
    // public static void main(String[] args) {
    //     for (int i = 10; i > 0 ; i--) {
    //         System.out.println("counter:" + i);
    //     }
    // }

    /** practice 2 */
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + "の段（開始）");
            for (int k = 1; k <= 9; k++) {
                System.out.println(i + "*" + k + " = "  + i * k);
            }
            System.out.println(i + "の段（終了）");
        }
    }
}
