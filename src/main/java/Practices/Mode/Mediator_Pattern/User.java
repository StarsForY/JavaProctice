package Practices.Mode.Mediator_Pattern;
// 1. 新建一个抽象的牌友类
public abstract class User {
    protected int money;

    public User(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public abstract void changemoney(int cmoney,AbstractMediator mediator);
}
