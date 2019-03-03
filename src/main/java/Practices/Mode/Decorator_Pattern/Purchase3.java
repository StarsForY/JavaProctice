package Practices.Mode.Decorator_Pattern;
// 4. 实现多重进货
public class Purchase3 extends Purchase_abs {
    public Purchase3(Fruit_Shop fruitShop) {
        super(fruitShop);
    }

    // 这里重写水果店接口的方法，用于进指定的水果
    public void Purchase() {
        fruitShop.Purchase();
        System.out.println("进香蕉");
    }
}
