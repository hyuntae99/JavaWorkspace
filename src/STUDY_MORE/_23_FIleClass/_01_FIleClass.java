package STUDY_MORE._23_FIleClass;

import java.io.File;

public class _01_FIleClass {
    public static void main(String[] args) {
        // File을 file에 참조시킴. -> 이름 or 주소
        // File file = new File("secret_message.txt");
        File file = new File("C:/Java_workspace/JavaWorkspace/src/STUDY_MORE/STUDY_MORE._23_FIleClass/secret_message.txt");

        // 파일이 존재하면
        if (file.exists()) {
            System.out.println("That file exist! :O!");
            System.out.println(file.getPath()); // 경로 출력
            System.out.println(file.getAbsolutePath()); // 경로 출력
            System.out.println(file.isFile()); // true
            // file.delete(); // 파일 삭제
        }
        // 파일이 없으면
        else {
            System.out.println("That file doesn't exist :(");
            System.out.println(file.isFile()); // false
        }
    }
}
