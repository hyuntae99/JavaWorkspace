package STUDY_MORE._46_Generics;

public class _01_Generics_Method {
    public static void main(String[] args) {


        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] chrArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"B", "Y", "E"};

        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(chrArray);
        displayArray(stringArray);

        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(chrArray));
        System.out.println(getFirst(stringArray));

    }

    // 자료형을 Thing으로 처리함으로써 모든 값을 처리할 수 있음
    // 함수를 사용할때, 다양한 자료형을 사용하는 함수를 단순화할 수 있다.
    public static <Thing> void displayArray (Thing[] array) {

        for (Thing x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static <Thing> Thing getFirst (Thing[] array) {
        return array[0];
    }

    // Overloading의 방법
//    public static void displayArray (Double[] array) {
//
//        for (Double x : array) {
//            System.out.print(x + " ");
//        }
//        System.out.println();
//    }
//
//    public static void displayArray (Character[] array) {
//
//        for (Character x : array) {
//            System.out.print(x + " ");
//        }
//        System.out.println();
//    }
//
//    public static void displayArray (String[] array) {
//
//        for (String x : array) {
//            System.out.print(x + " ");
//        }
//        System.out.println();
//    }

}
