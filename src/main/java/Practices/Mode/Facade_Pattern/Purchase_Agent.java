package Practices.Mode.Facade_Pattern;
// 3. 创建外观类（代理商），包含类型为实现类A1和A2 的属性，在无参构造方法中使用对应的实现类去初始化对象，再创建给店老板调用的购买水果的方法
public class Purchase_Agent {
    private Fruit_Purchase apple;
    private Fruit_Purchase orange;

    public Purchase_Agent() {
        apple = new Apple_Purchase();
        orange = new Orange_Purchase();
    }

    public void getApple(){
        System.out.println("店老板想要苹果");
        apple.Purchase();
        System.out.println("代理商将苹果卖给店老板");
    }

    public void getOrange(){
        System.out.println("店老板想要橘子");
        orange.Purchase();
        System.out.println("代理商将橘子卖给店老板");
    }
}
