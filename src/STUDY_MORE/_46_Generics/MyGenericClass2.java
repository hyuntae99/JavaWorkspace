package STUDY_MORE._46_Generics;

// Thing extends Number를 사용하면 제한이 생김 -> int, double OK.
public class MyGenericClass2 <Thing, Thing2> {
    Thing x;
    Thing2 y;

    MyGenericClass2 (Thing x, Thing2 y) {
        this.x = x;
        this.y = y;
    }

    public Thing2 getValue () {
        return y;
    }
}
