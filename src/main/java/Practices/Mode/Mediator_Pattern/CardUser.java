package Practices.Mode.Mediator_Pattern;
// 2. 创建一个牌友类的实体类
public class CardUser extends User {
    public CardUser(int money) {
        super(money);
    }

    public void changemoney(int cmoney, AbstractMediator mediator) {
        mediator.WinMoney(cmoney,this);
    }
}
