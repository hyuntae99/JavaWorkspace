package STUDY_MORE._16_SuperKeyword;

public class Hero extends Person {
    String power;

    Hero(String name, int age, String power) {
        // hero도 person에 포함되므로
        // super를 통해 name, age를 사용할 수 있다.
        super(name, age);
        this.power = power;
    }

    public String toStirng() {
        // return this.name + "\n" + this.age + "\n" + power + "\n";
        return super.toStirng() + this.power  + "\n";
    }
}
