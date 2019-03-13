package Practices.Mode.Mediator_Pattern;
// 3. 新建一个抽象的中介者类
public abstract class AbstractMediator {
    protected User userA;
    protected User userB;

    public AbstractMediator(User userA, User userB) {
        this.userA = userA;
        this.userB = userB;
    }

    public abstract void WinMoney(int cmoney,User user);

}
