package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> persons= new ArrayList<>();

        printNames(persons);

        persons.add(new Person(11, "a"));
        persons.add(new Person(18, "b"));
        persons.add(new Person(20, "c"));
        persons.add(new Person(15, "d"));
        persons.add(new Person(25, "e"));

    }

    private static void printNames(List<Person> persons) {
        printFields(persons, p -> p.getName());
    }

    private static void printAges(List<Person> persons) {

    }

    printFields

}
