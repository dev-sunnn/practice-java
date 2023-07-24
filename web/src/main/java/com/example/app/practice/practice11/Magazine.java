package com.example.app.practice.practice11;

public class Magazine extends Book{
    int day;
    void printMag() {
        printBook();
        System.out.println("発 売 日：" + day + "日");
    }
}
