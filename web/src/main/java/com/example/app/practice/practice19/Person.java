package com.example.app.practice.practice19;

public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }

    /** practice 3 */
    public void displayInfo() {
        System.out.println("名前: " + name);
        System.out.println("年齢: " + age);
    }
}
