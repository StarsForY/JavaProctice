package Practices.Mode.Observer_Pattern;
// 4. 创建一个水果店老板类实现被观察者抽象类
public class FruitShopBoss extends FruitShop {
    public void updateMessage() {
        System.out.println("水果店老板进货水果，并发出信息。");
        for(Observer observer:observers){
            observer.reciveMessage("新进当季水果，有xxx...，欢迎前来购买！");
        }
    }
}
