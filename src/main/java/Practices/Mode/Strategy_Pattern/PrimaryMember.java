package Practices.Mode.Strategy_Pattern;
// 2. 初级会员
public class PrimaryMember implements Member {
    public double getItemsPrice(double money) {
        System.out.println("初级会员，9折福利，想要更低折扣请继续充值。");
        return money*0.9;
    }
}
