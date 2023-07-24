package com.example.app.practice;

/**
 * 基本：Javaの基礎（分岐）：解答
 */
public class Practice3 {
    /** practice 1 */
    public static void main(String[] args) {
        int x = 1;
        int y = 100;
        if ( x > y) {
            System.out.println("x は y より大きい。");
        } else if ( y > x) {
            System.out.println("y は x より大きい。");
        } else {
            System.out.println("x と y は同じ。");
        }
    }
}
