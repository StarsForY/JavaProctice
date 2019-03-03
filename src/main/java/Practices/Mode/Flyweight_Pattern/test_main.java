package Practices.Mode.Flyweight_Pattern;
// 测试是不是达到了对象多次复用的情况
public class test_main {
    public static void main(String[] args) {
        Fruit_Purchase apple = Purchase_Factory.get_purchase("apple");
        apple.Purchase();
        System.out.println("---------------");
        Fruit_Purchase orange = Purchase_Factory.get_purchase("orange");
        orange.Purchase();
        System.out.println("---------------");
        apple.Purchase();
    }
}
