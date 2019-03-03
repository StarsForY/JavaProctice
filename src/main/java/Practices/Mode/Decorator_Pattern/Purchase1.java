package Practices.Mode.Decorator_Pattern;
// 3. 创建一个装饰类去实现进多种货（逻辑在理解中）
public class Purchase1 implements Fruit_Shop {
    private Fruit_Shop fruitShop;

    public Purchase1(Fruit_Shop fruitShop) {
        this.fruitShop = fruitShop;
    }

    public void Purchase() {
        fruitShop.Purchase();
        System.out.println("进苹果");
    }
}
