package Practices.Mode.Builder_Pattern;
//5. 测试
public class test_main {
    public static void main(String[] args) {
        Director director = new Director();
        GirlFriend girlFriend = director.CreateGirlFriendByDirector(new SmartGirlFriend());
        System.out.println(girlFriend.toString());
    }
}
