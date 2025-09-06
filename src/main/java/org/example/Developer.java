package org.example;

public class Developer {

    private int age;

    public Developer(int age) {
        this.age = age;
    }

    public Developer() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void build()
    {
        System.out.println("Building a java project");
    }
}
