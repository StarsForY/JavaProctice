package Practices.Mode.Facade_Pattern;
// 4. 测试，定义代理商的类，假装自己是店老板，去调用代理商给店老板进货的方法。
public class test_main {
    public static void main(String[] args) {
        Purchase_Agent agent = new Purchase_Agent();
        agent.getApple();
        System.out.println("----------------");
        agent.getOrange();
    }
}
