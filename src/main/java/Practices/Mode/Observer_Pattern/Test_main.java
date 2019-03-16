package Practices.Mode.Observer_Pattern;
// 5. 测试
public class Test_main {
    public static void main(String[] args) {
        Observer jack = new Guest("jack");
        Observer rose = new Guest("rose");
        Observer locy = new Guest("locy");

        FruitShop fruitShop = new FruitShopBoss();

        fruitShop.addObserver(jack);
        fruitShop.addObserver(rose);
        fruitShop.addObserver(locy);

        fruitShop.updateMessage();

    }
}
