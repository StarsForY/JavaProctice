package Practices.Mode.Strategy_Pattern;
// 3. 商品类
public class Items {
    private Member member;

    public Items(Member member) {
        this.member = member;
    }

    public void getPrice(double money){
        double price = member.getItemsPrice(money);
        System.out.println("商品最终价："+price);
    }
}
