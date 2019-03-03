package Practices.Mode.Decorator_Pattern;
// 3. 定义一个抽象装饰类来实现多重进货
public abstract class Purchase_abs implements Fruit_Shop {
    protected Fruit_Shop fruitShop;

    public Purchase_abs(Fruit_Shop fruitShop) {
        this.fruitShop = fruitShop;
    }

    public void Purchase_Fruit(){
        fruitShop.Purchase();
    }

}
