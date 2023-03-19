package CHAP_05;

public class QUIZ_05 {
    public static void main(String[] args) {
        int [] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++)
            sizeArray[i] = 250 + (i*5);

        // 270, 275 품절
        for (int i = 0; i < sizeArray.length; i++) {
            if (sizeArray[i] == 270 || sizeArray[i] == 275)
                System.out.println("사이즈 " + sizeArray[i] + " (품 절)");
            else
                System.out.println("사이즈 " + sizeArray[i] + " (재고 있음)");
        }
    }
}
