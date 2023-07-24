package com.example.app.practice.practice11;

public class Bookshelf {
    public static void main(String[] args) {
        Novel nov = new Novel();
        nov.title = "しおりの大冒険";
        nov.genre = "ファンタジー";
        nov.writer = "アンク";

        Magazine mag = new Magazine();
        mag.title = "月間Java";
        mag.genre = "コンピュータ";
        mag.day   = 20;

        nov.printNov();
        System.out.println();
        mag.printMag();
    }
}
