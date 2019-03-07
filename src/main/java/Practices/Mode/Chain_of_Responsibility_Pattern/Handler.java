package Practices.Mode.Chain_of_Responsibility_Pattern;
// 1. 先定义一个审批人抽象类，需要包含一个类型改为自己的属性，还有一个抽象的审批方法
public abstract class Handler {
    protected Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public abstract void Approval(int money);

}
