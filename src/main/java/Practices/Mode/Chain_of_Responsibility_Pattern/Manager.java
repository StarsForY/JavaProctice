package Practices.Mode.Chain_of_Responsibility_Pattern;
// 3. 定义一个经理类
public class Manager extends Handler {
    public void Approval(int money) {
        if(money <= 1000){
            System.out.println("经理审批通过！");
        }else{
            if(this.handler != null){
                System.out.println("金额太大，经理无权审批，上升到上一级");
                this.handler.Approval(money);
            }else{
                System.out.println("审批不通过");
            }
        }
    }
}
