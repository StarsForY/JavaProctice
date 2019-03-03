package Practices.Mode.Flyweight_Pattern;

import java.util.HashMap;
import java.util.Map;
// 2. 创建工厂对象，用于返回对应的进货对象
public class Purchase_Factory {
    private static final Map<String,Fruit_Purchase> purchase_fruit = new HashMap<String,Fruit_Purchase>();

    static Fruit_Purchase get_purchase(String fruit_name){
        Fruit_Purchase fruitPurchase = purchase_fruit.get(fruit_name);
        if(fruitPurchase == null){
            System.out.println("新建进"+fruit_name+"的进货对象");
            fruitPurchase = new Fruit_Purchase(fruit_name);
            purchase_fruit.put(fruit_name,fruitPurchase);
        }
        return fruitPurchase;
    }
}
