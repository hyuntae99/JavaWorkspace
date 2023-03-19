package STUDY_MORE._14_Inheritance;

public class Inheritance {
    public static void main(String[] args) {

        // 두 객체에는 아무것도 없지만 상속을 통해서 실행이 가능함!
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        // 부모 노드에게서 공통점을 받고
        bicycle.stop();
        car.go();
        System.out.println(bicycle.speed);
        System.out.println(car.speed);
        // 각자의 특성을 부여할 수 있음
        System.out.println(bicycle.pedals);
        // System.out.println(car.pedals); -> car pedal이 없음.
        System.out.println(car.doors);

    }
}
