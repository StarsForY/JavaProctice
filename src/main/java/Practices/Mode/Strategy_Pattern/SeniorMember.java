package Practices.Mode.Strategy_Pattern;
// 2. 高级会员
public class SeniorMember implements Member {
    public double getItemsPrice(double money) {
        System.out.println("高级会员尊享6折优惠。");
        return money*0.6;
    }
}
