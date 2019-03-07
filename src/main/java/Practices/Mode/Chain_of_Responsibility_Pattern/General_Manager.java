package Practices.Mode.Chain_of_Responsibility_Pattern;
// 3. 定义一个总经理类
public class General_Manager extends Handler {
    public void Approval(int money) {
        if(money <= 5000){
            System.out.println("总经理审批通过！");
        }else{
            System.out.println("审批不通过");
        }
    }
}
