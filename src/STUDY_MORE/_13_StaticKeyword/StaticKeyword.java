package STUDY_MORE._13_StaticKeyword;

public class StaticKeyword {
    public static void main(String[] args) {

        Friend friend1 = new Friend("현태");
        Friend friend2 = new Friend("수연");
        Friend friend3 = new Friend("종혁");

        System.out.println(Friend.numberOfFriends); // 3
        System.out.println(friend1.numberOfFriends); // 3

        Friend.displayFriend(); // 3
        friend2.displayFriend(); // 3

    }
}
