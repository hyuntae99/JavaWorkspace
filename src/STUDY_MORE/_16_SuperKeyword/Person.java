package STUDY_MORE._16_SuperKeyword;

public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toStirng() {
        return this.name + "\n" + this.age + "\n";
    }
}
