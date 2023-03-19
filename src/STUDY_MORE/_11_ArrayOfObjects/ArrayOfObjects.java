package STUDY_MORE._11_ArrayOfObjects;

public class ArrayOfObjects {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        char[] characters = new char[4];
        String[] strings = new String[5];

        /////////////////////////////////////////////////////////////////
        // 객체의 배열
        Food[] refrigerator = new Food[3];

        Food food1 = new Food("pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hotdog");

        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;

        // 선언과 동시에 값 설정.
        Food[] refrigerator1 = {food1, food2, food3};

        for (int i = 0; i < refrigerator.length; i++) {
            System.out.println(refrigerator[i]); // 주소를 반환
            System.out.println(refrigerator[i].name);
        }

        System.out.println();

        for (int i = 0; i < refrigerator1.length; i++)
            System.out.println(refrigerator1[i].name);
    }
}
