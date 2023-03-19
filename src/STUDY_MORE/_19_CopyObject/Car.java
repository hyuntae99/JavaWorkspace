package STUDY_MORE._19_CopyObject;

public class Car {
    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year) {
        this.setMake(make); // public 함수를 통해 변수 직접 변경가능.
        this.setModel(model);
        this.setYear(year);
    }


    // copy 함수를 통해 똑같은 객체 생성
    Car(Car x) {
        this.copy(x);
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


    // copy 함수
    // Car x에서 get함수를 통해 전달 후 set함수를 통해 변경
    public void copy (Car x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }

}
