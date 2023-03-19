package STUDY_MORE._07_Object;

public class Object {
    public static void main(String[] args) {
        // 객체지향프로그램

        // 다른 폴더의 Car 클래스를 가져옴.
        Car myCar1 = new Car();
        // 해당 클래스의 변수
        System.out.println(myCar1.make);
        System.out.println(myCar1.model);
        // 해당 클래스의 함수
        myCar1.drive();
        myCar1.brake();

        // 같은 속성의 다른 Car를 쉽게 만들 수 있다. -> 관리도 쉬움.
        Car myCar2 = new Car();
        System.out.println(myCar2.make);
        System.out.println(myCar2.model);
    }
}
