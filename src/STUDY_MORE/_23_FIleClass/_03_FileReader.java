package STUDY_MORE._23_FIleClass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _03_FileReader {
    public static void main(String[] args) {

        // 아스키 아트를 txt 파일에 저장하고 불러올 수 있ㅇ므.
        try {
            FileReader reader = new FileReader("C:/Java_workspace/JavaWorkspace/src/STUDY_MORE/STUDY_MORE._23_FIleClass/art.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}