package STUDY_MORE._18_Encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        Car car =
                new Car("HyunDai", "K9", 2022);

        // System.out.println(car.make); -> private 정보라서 참조 X
        System.out.println(car.getMake());  // public 함수를 통해 전달 가능!
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        System.out.println();

        // car.year = 2023; -> private 정보라서 변경 X
        car.setYear(2023);
        car.setModel("K11");
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

    }
}
