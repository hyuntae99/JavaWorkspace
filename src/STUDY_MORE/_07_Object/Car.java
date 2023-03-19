package STUDY_MORE._07_Object;

public class Car {
    String make = "HyunDai";
    String model = "K9";
    int year = 2022;
    String color = "Black";
    double price = 50000;

    void drive() {
        System.out.println("You drive the car");
    }
    void brake() {
        System.out.println("You step on the brakes");
    }

    // 모든 값을 얻기 위해 만들어야하는 함수
    public String toString() {
        String myString = make + "\n" + model + "\n" + year + "\n" +color + "\n" + String.valueOf(price);
        return myString;
    }
}
