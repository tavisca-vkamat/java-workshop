package com.company.Contracts;

import java.util.Comparator;
import java.util.Objects;

public class Person {
    private String Name;
    private int age;

    public Person(String name, int age) {
        this.Name = name;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


