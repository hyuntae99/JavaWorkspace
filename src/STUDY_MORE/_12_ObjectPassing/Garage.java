package STUDY_MORE._12_ObjectPassing;

public class Garage {

    // 함수를 만들 때, 인수로 객체를 받을 수 있다.
    void park (Car car) {
        System.out.println("The " + car.name + " is parked in the garage");
    }
}
