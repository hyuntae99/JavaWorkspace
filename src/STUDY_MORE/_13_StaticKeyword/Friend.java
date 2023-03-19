package STUDY_MORE._13_StaticKeyword;

public class Friend {
    String name;
    static int numberOfFriends;
    Friend(String name) {
        this.name = name;
        numberOfFriends++; // Friend 객체가 생성될때마다 ++
    }

    static void displayFriend() {
        System.out.println("You have " + numberOfFriends + " friends");
    }


}
