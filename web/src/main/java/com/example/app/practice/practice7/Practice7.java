package com.example.app.practice.practice7;

/**
 * 基本：Javaの基礎（配列）：解答
 */
public class Practice7 {
    /** practice 1 */
    // 正しいもの：②、誤っているもの：①、③、④、⑤

    /** practice 2 */
    // ①

    /** practice 3 */
    // ③が正しい。①はmethodAがprivateであり、②はmethodAがstaticでない。

    /** practice 4 */
    // MsgView.java

    /** practice 5 */
    public static void main(String[] args) {
        // TODO MsgViewクラスのインスタンス生成を記載
        MsgView msgView = new MsgView();
        // TODO dispMsgのメソッド呼び出しを記載
        String message = "ねこです。よろしくおねがいします。";
        msgView.dispMsg(message);
    }

    /** practice 6 */
    // FuncCalc.java

    /** practice 7 */
    // public static void main(String[] args) {
    //     // TODO FuncCalcクラスのインスタンスを生成
    //     FuncCalc funcCalc = new FuncCalc();
    //     // TODO multiplyメソッドの計算結果を出力
    //     int x = 3;
    //     int y = 5;
    //     int multiplyResult = funcCalc.multiply(x, y);
    //     System.out.println("x × y は " + multiplyResult + "です。");
    //     // TODO modメソッドの計算結果を出力
    //     int a = 11;
    //     int b = 5;
    //     int modResult = funcCalc.mod(a, b);
    //     System.out.println("x ÷ y の余りは " + modResult + "です。");
    // }
}
