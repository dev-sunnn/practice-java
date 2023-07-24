package com.example.app.practice;

/**
 * 基本：javaの基礎（メソッド）：解答
 */
public class Practice6 {
    /** practice 1 */
    // ⑤

    /** practice 2 */
    public static void main(String[] args) {
        introduce();
    }

    public static void introduce() {
        String name = "Java太郎";
        int age = 50;
        double height = 198.4;
        char gender = '男';
        System.out.println("私の名前は" + name + "です。");
        System.out.println("年齢は" + age + "です。");
        System.out.println("身長は" + height + "です。");
        System.out.println("性別は" + gender + "です。");
    }

    /** practice 3 */
    // public static void main(String[] args) {
    //     String title = "ペプシマン";
    //     String release = "1999年3月4日";
    //     String developer = "KID";
    //     game(title, release, developer);
    // }

    // public static void game(String title, String release,
    //     String developer) {
    //     System.out.println("ゲームのタイトル：" + title);
    //     System.out.println("ゲームの発売日：" + release);
    //     System.out.println("開発元：" + developer);
    // }
}
