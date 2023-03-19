package STUDY_MORE._18_Encapsulation;

public class Car {
    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year) {
        this.setMake(make); // public 함수를 통해 변수 직접 변경가능.
        this.setModel(model);
        this.setYear(year);
    }

    // public 함수를 통해 전달가능
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }

    // public을 통해 변수 변경 가능
    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }

}
