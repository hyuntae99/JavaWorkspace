package STUDY_MORE._17_Abstraction;

public class Car extends Vehicle{

    // 추상클래스로 내용은 없고 이름만 있으므로 재정의 해야함 -> override
    @Override
    void go() {
        System.out.println("The driver is driving the car");
    }
}
