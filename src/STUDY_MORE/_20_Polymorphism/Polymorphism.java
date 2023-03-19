package STUDY_MORE._20_Polymorphism;

public class Polymorphism {
    public static void main(String[] args) {

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racer = {car, bicycle, boat};

        for (Vehicle x : racer){
            x.go();
        }
    }
}
