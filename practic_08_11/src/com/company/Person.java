package com.company;

public class Person {
    private final int age;
    private final String name;

    public Person (int age, String name) {
        this.age = age;
        this.name = name;
    }

    int getAge() {
        return this.age;
    }

    String getName() {
        return this.name;
    }
}
