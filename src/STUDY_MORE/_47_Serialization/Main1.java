package STUDY_MORE._47_Serialization;

import java.io.*;

public class Main1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // 역직렬화 (Deserialization)

        FileInputStream fileIn = new FileInputStream("C:\\Java_workspace\\JavaWorkspace\\src\\STUDY_MORE\\_47_Serialization\\UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        // ser.파일에서 정보를 읽어온다.
        Object obj = in.readObject();

        // obj의 정보가 User클래스에 있다면
        if (obj instanceof User) {
            User user = (User) obj;

            System.out.println(user.name);
            System.out.println(user.password);
            user.sayHello();

            // serialization과 같은 값 -> UID로 판단.
            long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
            System.out.println(serialVersionUID);

        } else {
            System.out.println("Object is not an instance of User class");
        }

        in.close();
        fileIn.close();

    }
}
