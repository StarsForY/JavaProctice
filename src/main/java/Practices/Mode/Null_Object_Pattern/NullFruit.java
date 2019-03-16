package Practices.Mode.Null_Object_Pattern;

public class NullFruit implements Fruit {
    public boolean isnull() {
        return true;
    }

    public void show() {
        System.out.println("对不起，您要的水果这没有。");
    }
}
