package org.example;

public class Developer {

    private int age;
    private Computer com;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void build()
    {
        com.compile();
        System.out.println("Building a java project");
    }
}
