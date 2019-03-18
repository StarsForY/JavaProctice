package Practices.Mode.Strategy_Pattern;
// 4. 测试
public class Test_Main {
    public static void main(String[] args) {
        Member m = new MiddleMember();
        Items item1 = new Items(m);
        item1.getPrice(500);

        Member h = new SeniorMember();
        Items item2 = new Items(h);
        item2.getPrice(500);
    }
}
