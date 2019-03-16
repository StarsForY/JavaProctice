package Practices.Mode.Null_Object_Pattern;

public class Apple implements Fruit {
    public boolean isnull() {
        return false;
    }

    public void show() {
        System.out.println("苹果是有的，还是北方的");
    }
}
