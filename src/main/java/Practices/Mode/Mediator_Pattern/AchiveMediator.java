package Practices.Mode.Mediator_Pattern;
// 4. 新建一个中介者实体类
public class AchiveMediator extends AbstractMediator {
    public AchiveMediator(User userA, User userB) {
        super(userA, userB);
    }

    public void WinMoney(int cmoney, User user) {
        if(user == userA){
            userA.money += cmoney;
            userB.money -= cmoney;
            System.out.println("A赢"+cmoney+",当前A的余额为"+userA.money+"，当前B的余额为"+userB.money);
        }else{
            userB.money += cmoney;
            userA.money -= cmoney;
            System.out.println("B赢"+cmoney+",当前A的余额为"+userA.money+"，当前B的余额为"+userB.money);
        }
    }


}
