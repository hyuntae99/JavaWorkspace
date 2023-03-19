package STUDY_MORE._15_MethodOverriding;

public class MethodOverriding {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        // 특정 구조체에 같은 이름의 함수가 있다면,
        // override 함수를 실행함.
        animal.speak();
        dog.speak();
        cat.speak();

    }
}
