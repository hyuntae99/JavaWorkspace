package STUDY_MORE._01_to_06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _02_VariableInputAndOutput {
    public static void main(String[] args) {
        try {
            // out.txt의 int값을 저장
            File file = new File("out.txt");
            // sc에 입력
            Scanner sc = new Scanner(file);
            while (sc.hasNextInt()) {
                System.out.println(sc.nextInt() * 1000);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
