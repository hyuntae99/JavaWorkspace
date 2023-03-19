package STUDY_MORE._23_FIleClass;

import java.io.FileWriter;
import java.io.IOException;
public class _02_FileWriter {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("C:/Java_workspace/JavaWorkspace/src/STUDY_MORE/STUDY_MORE._23_FIleClass/poem.txt");
            // write
            writer.write("Roses are red \nViolets are blue \nbooty booty booty!");
            // 추가
            writer.append("\nI'm so happy@@@!");
            writer.write("\n(A poem by HT)");
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
