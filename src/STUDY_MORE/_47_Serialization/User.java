package STUDY_MORE._47_Serialization;

import java.io.*;

public class User implements Serializable {

    // Class를 수정, 변경하면 UID가 변경된다.
    // 따라서 상수로 설정해서 연결시키면 된다!!
    private static final long serialVersionUID = 1;

    String name;
    transient String password; // null로 출력됨.


    public void sayHello() {
        System.out.println("Hello " + name);
    }

}
