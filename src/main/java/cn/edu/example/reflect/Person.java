package cn.edu.example.reflect;

/**
 * @author virgil.Wang
 * @date 2020/5/12 17:25
 */
public class Person {

    private String name;
    private int age;

    protected Person() {}

    Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Person(String name) {
        this.name = name;
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

    public void eat() {
        System.out.println("eating ...");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
