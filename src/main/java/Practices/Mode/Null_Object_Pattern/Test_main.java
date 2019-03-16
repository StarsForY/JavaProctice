package Practices.Mode.Null_Object_Pattern;

public class Test_main {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new FruitFactory();
        Fruit fruit = fruitFactory.getFruit(-1);
        fruit.show();
    }
}
