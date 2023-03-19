package STUDY_MORE._46_Generics;

import java.util.ArrayList;
import java.util.HashMap;

public class _02_Generics_Class {
    public static void main(String[] args) {

        // 함수명 대로 하나의 변수만을 받고 하나의 변수만을 return하는 함수
//        MyIntegerClass myInt = new MyIntegerClass(1);
//        MyDoubleClass myDouble = new MyDoubleClass(3.14);
//        MyCharacterClass myChar = new MyCharacterClass('@');
//        MyStringClass myStr = new MyStringClass("Hello");
//
//        System.out.println(myInt.getValue());
//        System.out.println(myDouble.getValue());
//        System.out.println(myChar.getValue());
//        System.out.println(myStr.getValue());

        ///////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////

        // 하나의 클래스로 다양한 자료형을 가진 객체를 만들어낼 수 있다.
        MyGenericClass<Integer> myInt = new MyGenericClass<>(1);
        MyGenericClass<Double> myDouble = new MyGenericClass<>(3.14);
        MyGenericClass<Character> myChar = new MyGenericClass<>('@');
        MyGenericClass<String> myStr = new MyGenericClass<>("Hello");

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myStr.getValue());

        // 대부분의 라이브러리는 Generic을 사용했다.
        // 하나의 클래스, 함수로 다양한 자료형을 사용할 수 있다.
        ArrayList<String> myFriends = new ArrayList<>();
        ArrayList<Double> myMoneys = new ArrayList<>();

        System.out.println();

        MyGenericClass2<Integer,Integer> myInt1 = new MyGenericClass2<>(1, 9);
        MyGenericClass2<Double,Double> myDouble1 = new MyGenericClass2<>(3.14, 1.01);
        MyGenericClass2<Character,Character> myChar1 = new MyGenericClass2<>('@', '$');
        MyGenericClass2<String,String> myStr1 = new MyGenericClass2<>("Hello", "Bye");

        System.out.println(myInt1.getValue());
        System.out.println(myDouble1.getValue());
        System.out.println(myChar1.getValue());
        System.out.println(myStr1.getValue());

        // Thing을 여러개 사용하여 다양한 자료형을 동시에 다룰 수 있다.

        HashMap<Integer, String> users = new HashMap<>();
    }
}
