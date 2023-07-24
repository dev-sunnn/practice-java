package com.example.app.practice;

/**
 * 基本２：javaの基礎（分岐）
 */
public class Practice8 {
    /** practice 1 */
    // public static void main(String[] args) {
    //     int rain = 49;
    //     System.out.println("降水確率は"+ rain +"％です");
    //     if (rain >= 50) {
    //         System.out.println("傘が必要です");
    //     } else if (rain < 50){
    //         System.out.println("傘は不要です");
    //     }
    // }

    /** practice 2 */
    public static void main(String[] args) {
        int rain = 0;
        if(rain > 100 || rain < 0){
                System.out.println("降水確率は1～100の間です");
        } else {
            System.out.println("降水確率は"+ rain +"％です");
            if (rain >= 50) {
                System.out.println("傘が必要です");
            }
            if (rain < 50){
                System.out.println("傘は不要です");
            }
        }
    }
}
