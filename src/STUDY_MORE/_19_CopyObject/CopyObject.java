package STUDY_MORE._19_CopyObject;

public class CopyObject {
    public static void main(String[] args) {

        Car car1 =
                new Car("HyunDai", "K9", 2022);
        Car car2 =
                new Car("Ford", "Mustang", 2023);

        // car2를 car1와 똑같이 만들기!
        car2 = car1; // 효과 없음
        car2.copy(car1);

        // car1과 똑같은 car3 만들기
        Car car3 = new Car(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());

    }
}
