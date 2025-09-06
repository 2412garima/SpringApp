package org.example;

public class Developer {

    private int age;
    private Laptop laptop;

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

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build()
    {
        laptop.compile();
        System.out.println("Building a java project");
    }
}
