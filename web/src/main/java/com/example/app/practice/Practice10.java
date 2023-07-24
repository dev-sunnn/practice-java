package com.example.app.practice;

/**
 * 基本２：javaの基礎（メソッド）
 */
public class Practice10 {
    /** practice 1 */
    // public static void main(String[] args) {
    //     int addResult = add(10, 7);
    //     System.out.println("x + yは" + addResult + "です。");
    //     int minusResult = minus(9, 2);
    //     System.out.println("x - yは" + minusResult + "です。");
    // }

    // public static int add(int a, int b) {
    //     int result = a += b;
    //     return result;
    // }

    // public static int minus(int a, int b) {
    //     int result = a -= b;
    //     return result;
    // }

    /** practice 2 */
    // 変数xとyはmainメソッドでしか使用できないため、
    // 引数を渡していないaddメソッドでエラーとなる。

    /** practice 3 */
    public static void main(String[] args) {
        int x = 100;
        if (isMultipleOf2(x)) {
        System.out.println(x + "は2で割り切れます。");
        }else {
        System.out.println(x + "は2で割り切れません。");
        }
    }

    public static boolean isMultipleOf2(int n) {
        boolean result;
        result = ( n % 2  == 0 );
        return result;
    }
}
