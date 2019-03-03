package Practices.Mode.Decorator_Pattern;
// 4. 测试（逻辑在理解那一栏中）
public class Test_main {
    public static void main(String[] args) {
        // d第一种方式
        /*
        Fruit_Shop orange = new Purchase_Orange();
        Purchase1 purchase1 = new Purchase1(orange);
        Purchase2 purchase2 = new Purchase2(purchase1);

        purchase2.Purchase();
        */
        // 第二种方式
        Fruit_Shop apple = new Purchase_Apple();
        Purchase3 purchase3 = new Purchase3(apple);

        purchase3.Purchase();
    }
}
