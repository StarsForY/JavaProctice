package Practices.Mode.Decorator_Pattern;
// 2. 实现水果店接口，完成进货功能（这里进橘子）。
public class Purchase_Orange implements Fruit_Shop {

    public void Purchase() {
        System.out.println("进货橘子");
    }
}
