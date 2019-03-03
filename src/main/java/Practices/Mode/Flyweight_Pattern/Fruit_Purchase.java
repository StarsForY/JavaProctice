package Practices.Mode.Flyweight_Pattern;
// 1. 首先创建水果进货接口A，包含进货方法
public class Fruit_Purchase {
    private String fruit_name;

    public Fruit_Purchase(String fruit_name) {
        this.fruit_name = fruit_name;
    }

    public void Purchase(){
        System.out.println("去"+fruit_name+"生产地购买"+fruit_name);
    }
}
