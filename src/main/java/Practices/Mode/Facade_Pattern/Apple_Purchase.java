package Practices.Mode.Facade_Pattern;
// 2. 然后创建对应的水果进货方法类，实现接口A，重写进货方法
public class Apple_Purchase implements Fruit_Purchase {

    public void Purchase() {
        System.out.println("代理商去苹果生产地购买苹果");
    }
}
