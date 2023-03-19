package STUDY_MORE._08_Constructors;

public class Constructors {
    public static void main(String[] args) {
        // 구조체를 이용하여 성질이 다른 여러 개의 객체가 나옴.
        Human human1 = new Human("HyunTae", 25, 66.7);
        Human human2 = new Human("SooYeoun", 24, 60.2);

        // 각각의 성질의 값은 다르지만 같은 변수와 함수를 사용한다.
        System.out.println(human1.name);
        System.out.println(human1.age);
        System.out.println(human1.weight);
        human1.eat();
        human1.drink();

        System.out.println();

        System.out.println(human2.name);
        System.out.println(human2.age);
        System.out.println(human2.weight);
        human2.eat();
        human2.drink();
    }
}
