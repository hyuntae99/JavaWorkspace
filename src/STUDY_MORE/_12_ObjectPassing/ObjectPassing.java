package STUDY_MORE._12_ObjectPassing;

public class ObjectPassing {
    public static void main(String[] args) {

        // 객체끼리 연결하는 방법
        Garage garage = new Garage();

        Car car1 = new Car("BWM");
        Car car2 = new Car("K9");
        Car car3 = new Car("Tesla");

        garage.park(car1);
        garage.park(car2);
        garage.park(car3);

    }
}
