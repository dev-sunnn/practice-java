package com.example.app.practice.practice11;

public class Novel extends Book {
    String writer;
    void printNov() {
        printBook();
        System.out.println("著　　者：" + writer);
    }
}
