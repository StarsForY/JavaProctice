package Practices.Mode.Mediator_Pattern;
// 5.测试
public class Test_Mian {
    public static void main(String[] args) {
        User userA = new CardUser(5000);
        User userB = new CardUser(5000);

        AbstractMediator mediator = new AchiveMediator(userA,userB);

        userA.changemoney(500,mediator);
        userB.changemoney(200,mediator);
    }
}
