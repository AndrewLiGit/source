package com.jeff.drools;

public class Person {
    private String name;
    private String sex;
    private int age;

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", sex=" + sex + ", age=" + age + "]";
    }

}
