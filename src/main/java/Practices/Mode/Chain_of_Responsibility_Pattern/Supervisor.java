package Practices.Mode.Chain_of_Responsibility_Pattern;
// 2. 定义一个主管类
public class Supervisor extends Handler{
    public void Approval(int money) {
        if(money <= 100){
            System.out.println("主管审批通过！");
        }else{
            if(this.handler != null){
                System.out.println("金额太大，主管无权审批，上升到上一级");
                this.handler.Approval(money);
            }else{
                System.out.println("审批不通过");
            }
        }
    }
}
