package STUDY_MORE._15_MethodOverriding;

public class Dog extends Animal {
    @Override // 오버라이딩 표시
    void speak () {
        System.out.println("멍멍");
    }
}
