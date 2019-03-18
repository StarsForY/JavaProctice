package Practices.Mode.Strategy_Pattern;
// 2. 中级会员
public class MiddleMember implements Member {
    public double getItemsPrice(double money) {
        System.out.println("中级会员，享有8折优惠，更低6折优惠等您开启。");
        return money*0.8;
    }
}
