package STUDY_MORE._10_toString;

public class toString {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.color);

        Car car1 = new Car();

        // 주소를 반환한다. (car, car1은 다른 주소가 나옴)
        // toString을 정의하면, 둘다 원하는 값을 반환시킴
        System.out.println(car);
        System.out.println();
        System.out.println(car1);
        System.out.println();
        System.out.println(car.toString());
    }
}
