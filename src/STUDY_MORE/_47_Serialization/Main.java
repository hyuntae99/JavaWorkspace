package STUDY_MORE._47_Serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        // 직렬화 (Serialization)

        User user = new User();

        user.name = "Bro";
        user.password = "Password1234";

        FileOutputStream fileOut = new FileOutputStream("C:\\Java_workspace\\JavaWorkspace\\src\\STUDY_MORE\\_47_Serialization\\UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("object info saved! :)");

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);
    }


}
