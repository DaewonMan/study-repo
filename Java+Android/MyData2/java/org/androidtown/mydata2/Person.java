package org.androidtown.mydata2;

/**
 * Created by DaewonMan on 2016-07-21.
 */
public class Person {
    String name;

    int age;

    public Person() {

    }
    public Person(String name) {
        this.name = name;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
