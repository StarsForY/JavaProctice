package Practices.Mode.Proxy_Pattern;
// 2. 创建一个外卖的实现类，定具体的外卖
public class food1 implements foods {
    private String food_name;

    public food1(String food_name) {
        this.food_name = food_name;
    }

    public void shopping_foods() {
        System.out.println("定一份"+food_name+"成功");
    }
}
