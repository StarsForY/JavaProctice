package Practices.Mode.Decorator_Pattern;
// 3. 创建一个装饰类去实现进多种货（逻辑在理解中）
public class Purchase2 implements Fruit_Shop {
    private Fruit_Shop fruitShop2;

    public Purchase2(Fruit_Shop fruitShop2) {
        this.fruitShop2 = fruitShop2;
    }

    public void Purchase() {
        fruitShop2.Purchase();
        System.out.println("进香蕉");
    }
}
