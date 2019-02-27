package Practices.Mode.Builder_Pattern;
// 3. 创建一个类去实现之前的接口，这个类中决定一套GirlFriend的标准，可以在定义其他的实现类，然后在实现另一套标准
public class SmartGirlFriend implements Builder_GirlFriend {
    public GirlFriend smartGirl;

    public SmartGirlFriend(){
        smartGirl = new GirlFriend();
    }

    public void buildBody() {
        smartGirl.setBody("正常人的身材");
    }

    public void buildname() {
        smartGirl.setName("小红");
    }

    public void buildBage() {
        smartGirl.setAge("22");
    }

    public void buildIQ() {
        smartGirl.setIQ("180");
    }

    public GirlFriend CreateGirl() {
        return smartGirl;
    }
}
